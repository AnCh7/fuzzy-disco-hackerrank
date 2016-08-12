package hackerrank.algorithms.implementation.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge20_Utopian_Tree extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val t = sc.nextInt()
      var a0 = 0
      while (a0 < t) {
        var n = sc.nextInt()
        a0 += 1
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "3",
      "0",
      "1",
      "4"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1",
      "2",
      "7"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}