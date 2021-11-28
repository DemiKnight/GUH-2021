
import scala.concurrent.duration._

2.+(2)

10.seconds

def test(input: Int, f: Int => String): Unit = {
  println(f(input))
}

test(10, number => s"$number xxx")