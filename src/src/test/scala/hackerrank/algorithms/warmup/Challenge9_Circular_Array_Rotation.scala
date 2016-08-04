package hackerrank.algorithms.warmup.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge9_Circular_Array_Rotation extends FunSuite {

  object Solution {

    def main(args: Array[String]) {

    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "3 2 3",
      "1 2 3",
      "0",
      "1",
      "2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "2",
      "3",
      "1"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}