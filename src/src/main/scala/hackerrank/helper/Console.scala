package hackerrank.helper.scala

import scala.collection.mutable

object Console {

  private var output: mutable.Queue[String] = mutable.Queue()

  def setOutputData(out: mutable.Queue[String]) = output = out

  def println() = {}

  def println(x: Any) = {
    if (output.nonEmpty) {
      val elem = output.dequeue
      assert(x.toString == elem, s"$x not equals $elem")
      Predef.println(s"$x equals $elem")
    }
  }
}
