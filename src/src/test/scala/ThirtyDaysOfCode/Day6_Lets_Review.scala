package ThirtyDaysOfCode

import org.scalatest.FunSuite

class Day6_Lets_Review extends FunSuite {

  object Solution {

    import scala.io.StdIn

    def isEven(number: Int) = number % 2 == 0
    def isOdd(number: Int) = !isEven(number)

    def main(args: Array[String]) {

      val T = StdIn.readInt()

      if (T >= 1 && T <= 10) {
        for (i <- 1 to T) {
          val S = StdIn.readLine()

          if (S.length <= 1000 && S.length >= 2) {
            val odds = new StringBuilder
            val evens = new StringBuilder
            for (i <- 0 until S.length) {
              i match {
                case i if i == 0 | isEven(i) => evens.append(S.charAt(i))
                case i if isOdd(i) => odds.append(S.charAt(i))
              }
            }

            println(evens.toString() + " " + odds.toString())
          }
        }
      }
    }
  }

  test("Run solution") {
    Solution.main(null)
  }
}