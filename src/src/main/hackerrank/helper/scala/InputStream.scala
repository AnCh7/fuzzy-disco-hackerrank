package hackerrank.helper.scala

import scala.collection.mutable

class InputStream {
  private var input: mutable.Queue[String] = mutable.Queue()
  private def getNext: String = if (input.isEmpty) "" else input.dequeue

  def setInputData(in: mutable.Queue[String]) = input = in
  def getNextString: String = this.getNext
  def getNextInt: Int = getNext.toInt
}
