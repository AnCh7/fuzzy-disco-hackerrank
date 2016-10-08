package hackerrank.codingTests.atlassian

import hackerrank.helper.{Console, Scanner, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge2 extends FunSuite {

  object Solution {

    def process(start: String): String = {
      var counter = 0
      var res = ""
      for (i <- start.indices) {
        if (i == 0 || start(i) == start(i - 1)) counter = counter + 1
        else {
          res = res + counter + start(i - 1)
          counter = 1
        }
      }
      res = res + counter + start.last.toString
      res
    }

    def LookAndSay(start: String, n: Int): String = {
      var tmp = start
      for (i <- 0 until n) {
        tmp = process(tmp)
      }
      tmp
    }

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val _start = sc.nextLine()
      val _n: Int = sc.nextInt()
      val res = LookAndSay(_start, _n)
      Console.println(res)
    }
  }

  test("Sample 0") {

    val inputData = mutable.Queue(
      "1",
      "1"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "11"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

  test("Sample 1") {

    val inputData = mutable.Queue(
      "111221",
      "1"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "312211"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}