package hackerrank.algorithms.warmup.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge2_Simple_Array_Sum extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      sc.nextLine()
      val input = sc.nextLine().split(" ").map(x => x.toInt)
      Console.println(input.sum)
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "6",
      " ",
      "1 2 3 4 10 11"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "31"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}