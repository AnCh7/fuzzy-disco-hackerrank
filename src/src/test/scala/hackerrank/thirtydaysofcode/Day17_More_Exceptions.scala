package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day17_More_Exceptions extends FunSuite {

  object Solution {

    class Calculator() {
      def power(n: Int, p: Int): Int = {
        if (n < 0 || p < 0) throw new Exception("n and p should be non-negative")
        else math.pow(n, p).toInt
      }
    }

    def main(args: Array[String]) {
      val myCalculator = new Calculator()
      var T = StdIn.readLine().toInt

      while (T > 0) {
        val Array(n, p) = StdIn.readLine().split(" ").map(_.toInt)
        try {
          val ans = myCalculator.power(n, p)
          Console.println(ans);
        }
        catch {
          case e: Exception => Console.println(e.getMessage)
        }
        T -= 1
      }
    }
  }

  test("Run solution") {

    val inputData = mutable.Queue(
      "4",
      "3 5",
      "2 4",
      "-1 -2",
      "-1 3"
    )
    StdIn.setInputData(inputData)

    val outputData = mutable.Queue(
      "243",
      "16",
      "n and p should be non-negative",
      "n and p should be non-negative"
    )

    Console.setOutputData(outputData)

    Solution.main(null)
  }
}