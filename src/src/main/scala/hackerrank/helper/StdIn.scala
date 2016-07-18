package hackerrank.helper.scala

import scala.collection.mutable

object StdIn {
  private var input: mutable.Queue[String] = mutable.Queue()
  private def getNext = if (input.isEmpty) "" else input.dequeue

  def setInputData(in: mutable.Queue[String]) = input = in
  def readInt(): Int = getNext.toInt
  def readLine() = getNext
}
