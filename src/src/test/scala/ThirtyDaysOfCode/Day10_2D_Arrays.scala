package ThirtyDaysOfCode

import Infrastructure.HackersHelper._
import org.scalatest.FunSuite

import scala.collection.mutable

class Day10_2D_Arrays extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val arr = Array.ofDim[Int](6, 6)

      for (arr_i <- 0 until 6) {
        for (arr_j <- 0 until 6) {
          arr(arr_i)(arr_j) = sc.nextInt()
        }
      }
    }
  }

  test("Run solution") {

    // Injecting input data from HackerRank challenge
    val inputData = mutable.Queue(
      "1 1 1 0 0 0",
      "0 1 0 0 0 0",
      "1 1 1 0 0 0",
      "0 0 2 4 4 0",
      "0 0 0 2 0 0",
      "0 0 1 2 4 0"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    // Injecting output data from HackerRank challenge
    val outputData = mutable.Queue(
      "19"
    )

    Console.setOutputData(outputData)

    // Running challenge
    Solution.main(null)
  }
}