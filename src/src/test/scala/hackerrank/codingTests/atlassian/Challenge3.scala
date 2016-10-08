package hackerrank.codingTests.atlassian

import hackerrank.helper.{Console, Scanner, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge3 extends FunSuite {

  object Solution {

    def convert(in: Long): String = {

      val base7 = List("0", "a", "t", "l", "s", "i", "n")
      val sevens = (0 to 15).map(x => math.pow(7, x).toLong)

      var tmp = in
      var result = ""

      while (tmp > 0) {
        if (tmp >= 7) {
          val divider = sevens.reverse.find(x => x <= tmp).getOrElse(0L)
          result = result + base7((tmp / divider).toInt)
          tmp = (tmp % divider) + 1
        }
        else {
          result = result + base7(tmp.toInt - 1)
          tmp = 0
        }
      }
      result
    }

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val _in: Int = sc.nextInt()
      val res = convert(_in)
      Console.println(res)
    }
  }

  test("Sample 0") {

    val inputData = mutable.Queue(
      "7"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "a0"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}