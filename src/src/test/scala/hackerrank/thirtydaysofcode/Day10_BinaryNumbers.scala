package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala._
import org.scalatest.FunSuite

import scala.collection.mutable

class Day10_BinaryNumbers extends FunSuite {

  object Solution {

    //import java.util.Scanner
    //import scala.collection.mutable

    def convertToBinary(n: Int) = {
      val stack = mutable.Stack[Int]()
      var N = n
      while (N > 0) {
        val remainder = N % 2
        N = N / 2
        stack.push(remainder)
      }
      stack.toList
    }

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      if (n <= math.pow(10, 6) && n >= 1) {
        val binaryNumbers = convertToBinary(n).mkString.split("0")
        val sums = binaryNumbers.map(x => x.map(c => c.asDigit).sum)
        Console.println(sums.max)
      }
    }
  }

  test("Run solution 1") {
    val inputData = mutable.Queue(
      "5"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1"
    )

    Console.setOutputData(outputData)

    Solution.main(null)
  }

  test("Run solution 2") {
    val inputData = mutable.Queue(
      "13"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "2"
    )

    Console.setOutputData(outputData)

    Solution.main(null)
  }
}