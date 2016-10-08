package hackerrank.algorithms.warmup.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge5_Diagonal_Difference extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      val a = Array.ofDim[Int](n, n)
      for (a_i <- 0 until n) {
        for (a_j <- 0 until n) {
          a(a_i)(a_j) = sc.nextInt()
        }
      }

      def findDiagonal(c0: Int, r0: Int, reverse: Boolean): Int = {
        var c = c0
        var r = r0
        var sum = 0
        var l = a.indices
        if (reverse) l = a.indices.reverse
        for (i <- l) {
          sum = sum + a(c)(r)
          if (reverse) c -= 1
          else c += 1
          r += 1
        }
        sum
      }

      val d1 = findDiagonal(0, 0, reverse = false)
      val d2 = findDiagonal(a.length - 1, 0, reverse = true)
      Console.println(math.abs(d1 - d2))
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "3",
      "11", "2", "4",
      "4", "5", "6",
      "10", "8", "-12"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "15"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}