package ThirtyDaysOfCode

import org.scalatest.FunSuite

class Day5_Loops extends FunSuite {

  object Solution {

    import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val N = sc.nextInt()

      if (N <= 20 && N >= 2) {
        for (i <- 1 to 10) {
          val result = N * i
          println(s"$N x $i = $result")
        }
      }
    }
  }

  test("Run solution") {
    Solution.main(null)
  }
}