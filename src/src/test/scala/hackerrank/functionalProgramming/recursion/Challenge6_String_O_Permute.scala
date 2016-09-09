package hackerrank.functionalProgramming.recursion.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge6_String_O_Permute extends FunSuite {

  object Solution {

    // import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val T = sc.nextInt()
      for (i <- 0 to T) {
        val str = sc.nextLine()
        val swapped = str.grouped(2).map(s => {
          val h = s.head
          s.tail.head.toString + h.toString
        }).toList

        if (swapped.nonEmpty) Console.println(swapped.mkString)
      }
    }
  }

  test("Sample Test Case") {

    val inputData = mutable.Queue(
      "2",
      "abcdpqrs",
      "az"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "badcqpsr",
      "za"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}