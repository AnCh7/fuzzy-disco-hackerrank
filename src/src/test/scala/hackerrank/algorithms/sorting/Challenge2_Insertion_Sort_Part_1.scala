package hackerrank.algorithms.sorting.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge2_Insertion_Sort_Part_1 extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)

      val size = sc.nextInt()
      if (size >= 1 && size <= 1000) {
        var arr = new Array[Int](size)
        for (i <- 0 until size) {
          val e = sc.nextInt()
          if (e >= -10000 && e <= 10000) {
            arr(i) = e
          }
        }

        val last = arr.last
        var isInserted = false
        for (elem <- (arr.length - 2) to 0 by -1) {
          val current = arr(elem)
          if (current > last) {
            arr.update(elem + 1, current)
            Console.println(arr.mkString(" "))
          }
          else {
            val begin = arr.take(elem + 1)
            val end = arr.drop(elem + 2)
            arr = begin ++ Array(last) ++ end
            Console.println(arr.mkString(" "))
            isInserted = true
            return
          }

          if (!isInserted && elem == 0) {
            arr = Array(last) ++ arr.tail
            Console.println(arr.mkString(" "))
          }
        }
      }
    }
  }

  test("Sample Input") {
    val inputData = mutable.Queue(
      "5",
      "2 4 6 8 3"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "2 4 6 8 8",
      "2 4 6 6 8",
      "2 4 4 6 8",
      "2 3 4 6 8"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

  test("Test case 1") {
    val inputData = mutable.Queue(
      "14",
      "1 3 5 9 13 22 27 35 46 51 55 83 87 23"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1 3 5 9 13 22 27 35 46 51 55 83 87 87",
      "1 3 5 9 13 22 27 35 46 51 55 83 83 87",
      "1 3 5 9 13 22 27 35 46 51 55 55 83 87",
      "1 3 5 9 13 22 27 35 46 51 51 55 83 87",
      "1 3 5 9 13 22 27 35 46 46 51 55 83 87",
      "1 3 5 9 13 22 27 35 35 46 51 55 83 87",
      "1 3 5 9 13 22 27 27 35 46 51 55 83 87",
      "1 3 5 9 13 22 23 27 35 46 51 55 83 87"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

  test("Test case 2") {
    val inputData = mutable.Queue(
      "10",
      "2 3 4 5 6 7 8 9 10 1"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "2 3 4 5 6 7 8 9 10 10",
      "2 3 4 5 6 7 8 9 9 10",
      "2 3 4 5 6 7 8 8 9 10",
      "2 3 4 5 6 7 7 8 9 10",
      "2 3 4 5 6 6 7 8 9 10",
      "2 3 4 5 5 6 7 8 9 10",
      "2 3 4 4 5 6 7 8 9 10",
      "2 3 3 4 5 6 7 8 9 10",
      "2 2 3 4 5 6 7 8 9 10",
      "1 2 3 4 5 6 7 8 9 10"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}