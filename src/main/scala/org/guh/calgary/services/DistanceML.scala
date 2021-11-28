package org.guh.calgary.services

import akka.actor.typed._
import akka.actor.typed.scaladsl._
import org.tensorflow.Tensor
import org.tensorflow.ndarray.Shape
import org.tensorflow.op.data.{CSVDataset, CSVDatasetV2}

object DistanceML {

  sealed trait DistMLCMD
  case object CreateModel extends DistMLCMD

  def apply(): Behavior[DistMLCMD]  = Behaviors.setup { context =>
//
    val test = "x,1,2"
//    val thingy = Tensor.of[CSVDatasetV2](classOf[CSVDatasetV2],Shape.of(16))

//    val mainDataset: CSVDatasetV2 = ???
//    mainDataset.op().


    Behaviors.receiveMessage {
      case CreateModel =>



        Behaviors.same
    }
  }
}
