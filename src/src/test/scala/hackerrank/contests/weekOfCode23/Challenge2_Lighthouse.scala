package hackerrank.contests.weekOfCode23.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge2_Lighthouse extends FunSuite {

  object Solution {

    // import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      if (n >= 1 && n <= 50) {
        val landscape = Array.ofDim[Boolean](n, n)
        for (i <- 0 until n) {
          val l = sc.nextLine()
          for (j <- 0 until l.length) {
            if (l(j).toString.equals(".")) landscape(i)(j) = true
          }



        }
      }
    }
  }

  test("Sample 0") {

    val inputData = mutable.Queue(
      "9",
      "*********",
      "****.****",
      "**.....**",
      "**.....**",
      "*.......*",
      "**.....**",
      "**.....**",
      "****.****",
      "*********"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "3"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

  test("Sample 1") {

    val inputData = mutable.Queue(
      "5",
      ".*.*.",
      "*...*",
      ".....",
      "*...*",
      ".*.*."
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "2"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

  test("Sample 2") {

    val inputData = mutable.Queue(
      "5",
      "***.*",
      "**..*",
      "***.*",
      "*****",
      "*****"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "0"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}