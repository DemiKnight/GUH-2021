package org.guh.calgary.services

import akka.actor.typed.{ActorRef, Behavior}
import akka.actor.typed.scaladsl.Behaviors
import enumeratum._
import org.guh.calgary.Main
import org.guh.calgary.models.Booking
import org.guh.calgary.services.BookingDB.DBActorCMD

import scala.collection.mutable

object BookingDB {

  sealed trait DBResult extends EnumEntry
  object DBResult extends Enum[DBResult] {
    val values: IndexedSeq[DBResult] = findValues

    case object Success extends DBResult
    case object Fail extends DBResult

  }

  sealed trait DBActorCMD
  final case class Update(booking: Booking, replyTo: ActorRef[Response]) extends DBActorCMD
  final case class Get(bookings: Seq[Booking])
  final case class Delete(booking: Booking, replyTo: ActorRef[Response]) extends DBActorCMD
  final case class Add(booking: Booking, replyTo: ActorRef[Response]) extends DBActorCMD
  final case class Response(reason: DBResult, returnValues: Seq[Booking] = Seq.empty) extends DBActorCMD

  val handler: ActorRef[DBActorCMD] = Main.actorSystem.systemActorOf[BookingDB.DBActorCMD](BookingDB(),"Booking-DB")

  def apply(): Behavior[DBActorCMD] = Behaviors.setup { context =>
    var bookings: Seq[Booking] = Seq.empty // todo get this tf out of here.

    Behaviors.receiveMessage {
      case Add(booking, handle) =>
        if(bookings.contains(booking)) {
          handle ! Response(DBResult.Fail)
        } else {
          bookings = bookings :+ booking
          handle ! Response(DBResult.Success, bookings)
        }
        Behaviors.same
      case Delete(booking, handle) =>
        if(bookings.contains(booking)) {
          val index = bookings.indexOf(booking)
          bookings = bookings.drop(index)
        } else {
          handle ! Response(DBResult.Fail)
        }

        Behaviors.same
      case Update(booking, handle) =>
        if(bookings.contains(booking)) {
          val index = bookings.indexOf(booking)
          bookings = bookings.updated(index, booking)

          handle ! Response(DBResult.Success, bookings)
        } else {
          handle ! Response(DBResult.Fail)
        }

        Behaviors.same
      case _ => Behaviors.unhandled
    }
  }
}
