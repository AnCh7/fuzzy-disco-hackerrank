package hackerrank.algorithms.sorting.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge1_Intro extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)

      val V = sc.nextInt()
      val n = sc.nextInt()

      val ar = new Array[Int](n)
      for (i <- 0 until n) {
        val ai = sc.nextInt()
        ar(i) = ai
      }

      if (n >= 1 && n <= 1000 && V >= -1000 && V <= 1000) {
        val index = ar.indexOf(V)
        Console.println(index)
      }
    }
  }

  test("Sample Input") {
    val inputData = mutable.Queue(
      "4",
      "6",
      "1 4 5 7 9 12"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }
}