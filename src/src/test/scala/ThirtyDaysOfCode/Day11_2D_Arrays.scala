package ThirtyDaysOfCode

import Infrastructure.Scala.ScalaHackersHelper._
import org.scalatest.FunSuite

import scala.collection.mutable

class Day11_2D_Arrays extends FunSuite {

  object Solution {

    //import java.util.Scanner
    import scala.collection.mutable.ArrayBuffer

    class Matrix() {
      val matrix: ArrayBuffer[ArrayBuffer[Int]] = new ArrayBuffer[ArrayBuffer[Int]]

      def add(array: ArrayBuffer[Int]) = matrix += array

      def hourGlassSum = matrix(0).sum + matrix(1)(1) + matrix(2).sum
    }

    def sliceJaggedArray(arr: Array[Array[Int]], slice: Int): ArrayBuffer[Matrix] = {

      def subMatrix(arrays: Array[Array[Int]], rStart: Int, cStart: Int, rEnd: Int, cEnd: Int): Matrix = {
        val matrix = new Matrix()
        for (row <- rStart until rEnd) {
          val hgRow = new ArrayBuffer[Int]()
          for (col <- cStart until cEnd) {
            hgRow += arrays(row)(col)
          }
          matrix.add(hgRow)
        }
        matrix
      }

      val result = new ArrayBuffer[Matrix]()

      for (i <- arr.indices) {
        for (j <- arr(i).indices) {
          val rEnd = slice + i
          val cEnd = slice + j
          if (rEnd <= arr.length && cEnd <= arr.length) result += subMatrix(arr, i, j, rEnd, cEnd)
        }
      }

      result
    }

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val array = Array.ofDim[Int](6, 6)

      // Input
      for (i <- 0 until 6) {
        val numbers = sc.nextLine().split(" ").map(x => x.toInt)
        for (k <- numbers.indices) {
          if (numbers(k) <= 9 && numbers(k) >= -9) {
            array(i)(k) = numbers(k)
          }
        }
      }

      // Calculations phase
      val matrices = sliceJaggedArray(array, 3)
      val max = matrices.map(h => h.hourGlassSum).max
      Console.println(max)
    }
  }

  test("Run solution") {
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

    val outputData = mutable.Queue(
      "19"
    )

    Console.setOutputData(outputData)

    Solution.main(null)
  }
}