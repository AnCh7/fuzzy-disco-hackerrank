package ThirtyDaysOfCode

import Infrastructure.HackersHelper._
import org.scalatest.FunSuite

class Day7_Arrays extends FunSuite {

  object Solution {

    import scala.collection.mutable.ArrayBuffer
    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)

      val n = sc.nextLine()
      if (!n.isEmpty) {
        val count = n.toInt
        if (count <= 1000 && count >= 1) {
          val arr = new ArrayBuffer[Int](count)
          val input = sc.nextLine().split(" ")
          for (elem <- input) {
            if (!elem.isEmpty) {
              var i = elem.toInt
              if (i <= 10000 && i >= 1) {
                arr += i
              }
            }
          }
          Console.println(arr.reverse.mkString(" "))
        }
      }
    }
  }

  test("Run solution") {

    // Injecting input data from HackerRank challenge
    val inputData = List(
      "4",
      "1 4 3 2 "
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    // Injecting output data from HackerRank challenge
    val outputData = List(
      "2 3 4 1"
    )

    Console.setOutputData(outputData)

    // Running challenge
    Solution.main(null)
  }
}