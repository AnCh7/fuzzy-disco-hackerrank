package hackerrank.functionalProgramming.recursion.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge5_String_Mingling extends FunSuite {

  object Solution {

    // import java.util.Scanner

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val P = sc.nextLine()
      val Q = sc.nextLine()
      val mingled = P.indices.map(i => P(i).toString.concat(Q(i).toString)).mkString
      Console.println(mingled)
    }
  }

  test("Sample Test Case #00") {

    val inputData = mutable.Queue(
      "abcde",
      "pqrst"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "apbqcrdset"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}