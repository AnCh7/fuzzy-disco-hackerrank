package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.annotation.tailrec
import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day25_Running_Time_And_Complexity extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def isPrime(n: Int): String = {
      if (n <= 1) return "Not prime"
      val result = n > 1 && Iterator.from(2).takeWhile(d => d * d <= n).forall(n % _ != 0)
      if (result) "Prime"
      else "Not prime"
    }

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val T = sc.nextInt()
      if (T <= 20 && T >= 1) {
        for (i <- 0 until T) {
          val n = sc.nextInt()
          if (n <= 2 * math.pow(10, 9) && n >= 1) {
            Console.println(isPrime(n))
          }
        }
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "3",
      "12",
      "5",
      "7"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "Not prime",
      "Prime",
      "Prime"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution2") {
    val inputData = mutable.Queue(
      "10",
      "1000000000",
      "1000000001",
      "1000000002",
      "1000000003",
      "1000000004",
      "1000000005",
      "1000000006",
      "1000000007",
      "1000000008",
      "1000000009"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "Not prime",
      "Not prime",
      "Not prime",
      "Not prime",
      "Not prime",
      "Not prime",
      "Not prime",
      "Prime",
      "Not prime",
      "Prime"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}