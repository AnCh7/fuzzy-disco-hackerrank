package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala.{Console, InputStream, Scanner, System}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day5_Loops extends FunSuite {

  object Solution {

    // import java.util.Scanner

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val N = sc.nextInt()

      if (N <= 20 && N >= 2) {
        for (i <- 1 to 10) {
          val result = N * i
          Console.println(s"$N x $i = $result")
        }
      }
    }
  }

  test("Run solution") {

    // Injecting input data from HackerRank challenge
    val inputData = mutable.Queue(
      "2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    // Injecting output data from HackerRank challenge
    val outputData = mutable.Queue(
      "2 x 1 = 2",
      "2 x 2 = 4",
      "2 x 3 = 6",
      "2 x 4 = 8",
      "2 x 5 = 10",
      "2 x 6 = 12",
      "2 x 7 = 14",
      "2 x 8 = 16",
      "2 x 9 = 18",
      "2 x 10 = 20"
    )
    Console.setOutputData(outputData)

    // Running challenge
    Solution.main(null)
  }
}