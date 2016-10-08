package hackerrank.helper

import scala.collection.mutable

class PrintStream {

  private val output: mutable.Queue[String] = mutable.Queue()

  def setOutputData(in: Seq[String]) = in.foreach(x => output.enqueue(x))
  def assertIsEmpty() = assert(output.isEmpty, "Output is not empty")
  def println() = {}
  def println(x: Any) = {
    if (output.nonEmpty) {
      val elem = output.dequeue
      assert(x.toString == elem, s"$x not equals $elem")
      Predef.println(s"$x equals $elem")
    }
  }
}
