package hackerrank.algorithms.warmup.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge7_Plus_Minus extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      val arr = new Array[Int](n)
      for (arr_i <- 0 until n) {
        arr(arr_i) = sc.nextInt()
      }

      val pos = arr.count(x => x > 0).toDouble / arr.length.toDouble
      val neg = arr.count(x => x < 0).toDouble / arr.length.toDouble
      val zer = arr.count(x => x == 0).toDouble / arr.length.toDouble

      Console.println(f"$pos%1.6f")
      Console.println(f"$neg%1.6f")
      Console.println(f"$zer%1.6f")
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "6",
      "-4", "3", "-9", "0", "4", "1"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "0.500000",
      "0.333333",
      "0.166667"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}