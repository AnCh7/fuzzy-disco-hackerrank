package ThirtyDaysOfCode

import org.scalatest.FunSuite

class Day3_Intro_to_Conditional_Statements extends FunSuite {

  object Solution {

    import java.util.Scanner

    def isEven(number: Int) = number % 2 == 0

    def isOdd(number: Int) = !isEven(number)

    def check(n: Int): Unit = n match {
      case _ if n >= 100 && n <= 1 =>
      case _ if isOdd(n) => println("Weird")
      case _ if isEven(n) =>
        n match {
          case _ if n >= 2 && n <= 5 => println("Not Weird")
          case _ if n >= 6 && n <= 20 => println("Weird")
          case _ if n > 20 => println("Not Weird")
        }
    }

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      check(sc.nextInt())
    }
  }

  test("Run solution") {
    Solution.main(null)
  }
}






