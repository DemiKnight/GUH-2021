package org.guh.calgary.services

import akka.actor.typed.{ActorRef, Behavior}
import akka.actor.typed.scaladsl.Behaviors
import org.guh.calgary.models.Booking

object BookingDB {

  trait DBActorCMD
  final case class Update[A](booking: Booking, replyTo: ActorRef[A]) extends DBActorCMD
  final case class Delete[A](booking: Booking, replyTo: ActorRef[A]) extends DBActorCMD
  final case class Add[A](booking: Booking, replyTo: ActorRef[A]) extends DBActorCMD

  val handler: ActorRef[DBActorCMD] = ???

  def apply(): Behavior[DBActorCMD] = Behaviors.setup { context =>
    Behaviors.receiveMessage {
      case Add(booking, handle) => ???
      case Delete(booking, handle) => ???
      case Update(booking, handle) => ???
      case _ => Behaviors.unhandled
    }
  }
}
