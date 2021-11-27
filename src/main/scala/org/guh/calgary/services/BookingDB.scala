package org.guh.calgary.services

import akka.actor.typed.{ActorRef, Behavior}
import akka.actor.typed.scaladsl.Behaviors
import enumeratum._
import org.guh.calgary.models.Booking

object BookingDB {

  sealed trait DBResult extends EnumEntry
  object Response extends Enum[DBResult] {
    val values: IndexedSeq[DBResult] = findValues

    case object Success extends DBResult
    case object Fail extends DBResult

  }

  sealed trait DBActorCMD
  final case class Update(booking: Booking, replyTo: ActorRef[Response]) extends DBActorCMD
  final case class Delete(booking: Booking, replyTo: ActorRef[Response]) extends DBActorCMD
  final case class Add(booking: Booking, replyTo: ActorRef[Response]) extends DBActorCMD
  final case class Response(reason: DBResult) extends DBActorCMD

  val handler: ActorRef[DBActorCMD] = ???

  def apply(): Behavior[DBActorCMD] = Behaviors.setup { context =>
    Behaviors.receiveMessage {
      case Add(booking, handle) =>

        ???
      case Delete(booking, handle) => ???
      case Update(booking, handle) => ???
      case _ => Behaviors.unhandled
    }
  }
}
