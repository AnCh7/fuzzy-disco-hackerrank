package hackerrank.algorithms.sorting.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge2_Insertion_Sort_Part_2 extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def swap(i: Int, j: Int, array: Array[Int]) {
      array.update(array.indexOf(i), j)
      array.update(array.indexOf(j), i)
    }

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)

      val size = sc.nextInt()
      if (size >= 1 && size <= 1000) {
        val elements = new Array[Int](size)
        for (i <- 0 until size) {
          val e = sc.nextInt()
          if (e >= -10000 && e <= 10000) {
            elements(i) = e
          }
        }

        def insertSort(array: Array[Int]) = {
          var j = 1
          while (j < array.length) {
            val element = array(j)
            var i = j - 1
            while (i >= 0 && array(i) > element) {
              array(i + 1) = array(i)
              i = i - 1
            }
            array(i + 1) = element
            Console.println(array.mkString(" "))
            j = j + 1
          }
          array
        }

        insertSort(elements)
      }
    }
  }

  test("Sample Input") {
    val inputData = mutable.Queue(
      "6",
      "1 4 3 5 6 2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1 4 3 5 6 2",
      "1 3 4 5 6 2",
      "1 3 4 5 6 2",
      "1 3 4 5 6 2",
      "1 2 3 4 5 6"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}