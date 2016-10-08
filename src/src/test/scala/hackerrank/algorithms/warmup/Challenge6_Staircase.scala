package hackerrank.algorithms.warmup.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge6_Staircase extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      for (i <- 1 to n) {
        val spaces = (1 to n - i).map(x => " ").toList
        val pounds = (1 to i).map(x => "#").toList
        val line = spaces ::: pounds
        Console.println(line.mkString)
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "6"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "     #",
      "    ##",
      "   ###",
      "  ####",
      " #####",
      "######"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}