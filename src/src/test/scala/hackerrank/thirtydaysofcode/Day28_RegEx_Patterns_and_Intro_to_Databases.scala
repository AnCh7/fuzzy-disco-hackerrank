package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day28_RegEx_Patterns_and_Intro_to_Databases extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val N = sc.nextInt()
      var a0 = 0
      while (a0 < N) {
        var firstName = sc.next()
        var emailID = sc.next()
        a0 += 1
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "6",
      "riya riya@gmail.com",
      "julia julia@julia.me",
      "julia sjulia@gmail.com",
      "julia julia@gmail.com",
      "samantha samantha@gmail.com",
      "tanya tanya@gmail.com"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "julia",
      "julia",
      "riya",
      "samantha",
      "tanya"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}