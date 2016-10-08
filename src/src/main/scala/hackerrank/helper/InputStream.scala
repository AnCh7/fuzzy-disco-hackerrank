package hackerrank.helper

import scala.collection.mutable

class InputStream {

  private val input: mutable.Queue[String] = mutable.Queue()
  private def getNext: String = if (input.isEmpty) "" else input.dequeue

  def setInputData(in: Seq[String]) = in.foreach(x => input.enqueue(x))
  def getNextString(): String = this.getNext
  def getNextInt(): Int = {
    val result = input.front.split(" ", 2)
    if (result.tail.nonEmpty) input.update(0, result.tail.head)
    else input.dequeue()
    result.head.toInt
  }
  def close() = input.clear()
}
