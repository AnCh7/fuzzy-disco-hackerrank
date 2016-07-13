package ThirtyDaysOfCode

import Infrastructure.Scala.ScalaHackersHelper._
import org.scalatest.FunSuite

import scala.collection.mutable

class Day9_Recursion extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def factorial(n: Int): Int =
      if (n == 0) 1
      else n * factorial(n - 1)

    def factorial_tr(n: Int, accumulator: Int): Int =
      if (n == 0) accumulator
      else factorial_tr(n - 1, accumulator * n)

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextLine()
      if (!n.isEmpty) {
        val N = n.toInt
        if (N <= 12 && N >= 1) {
          Console.println(factorial_tr(N, 1))
        }
      }
    }
  }

  test("Run solution") {

    // Injecting input data from HackerRank challenge
    val inputData = mutable.Queue(
      "3"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    // Injecting output data from HackerRank challenge
    val outputData = mutable.Queue(
      "6"
    )

    Console.setOutputData(outputData)

    // Running challenge
    Solution.main(null)
  }
}