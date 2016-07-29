package hackerrank.algorithms.warmup.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge1_Solve_Me_First extends FunSuite {

  object Solution {

    //import scala.io.StdIn

    def main(args: Array[String]) {
      val input1 = StdIn.readLine()
      val input2 = StdIn.readLine()
      val s = List(input1, input2).map(i => i.toInt).sum
      Console.println(s)
    }
  }

  test("Run solution") {
    // Injecting input data from HackerRank challenge
    val inputData = mutable.Queue(
      "2",
      "3"
    )
    StdIn.setInputData(inputData)

    // Injecting output data from HackerRank challenge
    val outputData = mutable.Queue(
      "5"
    )
    Console.setOutputData(outputData)

    // Running challenge
    Solution.main(null)
  }
}