package hackerrank.helper.scala

import scala.collection.mutable

class InputStream {
  private val input: mutable.Queue[String] = mutable.Queue()
  private def getNext: String = if (input.isEmpty) "" else input.dequeue
  def setInputData(in: Seq[String]) = in.foreach(x => input.enqueue(x))
  def getNextString: String = this.getNext
  def getNextInt: Int = {
    val result = this.getNext.split(" ", 2)
    if (result.tail.nonEmpty) input.update(0, result.tail.head)
    result.head.toInt
  }
}
