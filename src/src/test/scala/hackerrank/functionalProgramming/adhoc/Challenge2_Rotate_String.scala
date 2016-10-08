package hackerrank.functionalProgramming.adhoc.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge2_Rotate_String extends FunSuite {

  object Solution {

    // import java.util.Scanner
    import scala.collection.mutable.ListBuffer

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val T = sc.nextInt()

      for (i <- 0 until T) {

        val input = sc.next()
        def rotate(input: Array[Char]): List[String] = {
          var tmp = input
          val result = ListBuffer.empty[String]
          for (t <- input.indices) {
            val head = tmp.head
            tmp = tmp.tail :+ head
            result += tmp.mkString.trim
          }
          result.toList
        }

        val result = rotate(input.toCharArray)
        if (result.nonEmpty) Console.println(result.mkString(" "))
      }
    }
  }

  test("Sample Test Case") {

    val inputData = mutable.Queue(
      "5",
      "abc",
      "abcde",
      "abab",
      "aaa",
      "z"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "bca cab abc",
      "bcdea cdeab deabc eabcd abcde",
      "baba abab baba abab",
      "aaa aaa aaa",
      "z"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}