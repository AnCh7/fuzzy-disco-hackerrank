package hackerrank.contests.weekOfCode23.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge1_Gears_Of_War extends FunSuite {

  object Solution {

    // import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val q = sc.nextInt()
      if (q >= 1 && q <= math.pow(10, 5)) {
        for (i <- 0 until q) {
          val n = sc.nextInt()
          if (n >= 3 && n <= math.pow(10, 5)) {
            if (n % 2 == 0) Console.println("Yes")
            else Console.println("No")
          }
        }
      }
    }
  }

  test("Sample Test Case") {

    val inputData = mutable.Queue(
      "2",
      "3",
      "4"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "No",
      "Yes"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}