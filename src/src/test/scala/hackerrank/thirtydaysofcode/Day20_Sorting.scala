package hackerrank.thirtydaysofcode.scala

import hackerrank.helper._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

@RunWith(classOf[JUnitRunner])
class Day20_Sorting extends FunSuite {

  object Solution {

    case class Result(array: Array[Int], totalSwaps: Int)

    def sort(a: Array[Int]): Result = {
      var totalSwaps = 0
      var list = a.toList

      for (i <- 0 until list.length) {
        var numberOfSwaps = 0
        for (j <- 0 until list.length - 1) {
          if (list(j) > list(j + 1)) {
            var tmp = list(j + 1)
            list = list.updated(j + 1, list(j))
            list = list.updated(j, tmp)
            numberOfSwaps += 1
            totalSwaps += 1
          }
        }
        if (numberOfSwaps == 0) {
          return Result(list.toArray, totalSwaps)
        }
      }
      return Result(list.toArray, totalSwaps)
    }

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      val a = new Array[Int](n)
      for (a_i <- 0 until n) {
        a(a_i) = sc.nextInt()
      }

      val r = sort(a)
      Console.println(s"Array is sorted in ${r.totalSwaps} swaps.")
      Console.println(s"First Element: ${r.array.head}")
      Console.println(s"Last Element: ${r.array.last}")
    }
  }

  test("Run solution") {

    val inputData = mutable.Queue(
      "3",
      "1",
      "2",
      "3"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "Array is sorted in 0 swaps.",
      "First Element: 1",
      "Last Element: 3"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 2") {

    val inputData = mutable.Queue(
      "3",
      "3",
      "2",
      "1"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "Array is sorted in 3 swaps.",
      "First Element: 1",
      "Last Element: 3"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}