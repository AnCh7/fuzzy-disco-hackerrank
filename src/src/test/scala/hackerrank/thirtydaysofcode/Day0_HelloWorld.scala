package hackerrank.thirtydaysofcode.scala

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Day0_HelloWorld extends FunSuite {

  object Solution {

    import java.util.Scanner

    def main(args: Array[String]) {
      // Create a Scanner object to read input from stdin.
      val scan = new Scanner(System.in)

      // Read a full line of input from stdin and save it to our variable, inputString.
      val inputString = scan.nextLine()

      // Close the scanner object, because we've finished reading
      // all of the input from stdin needed for this challenge.
      scan.close()

      println("Hello, World.")
      println(inputString)
    }
  }

  ignore("Run solution") {
    Solution.main(null)
  }
}

