package ThirtyDaysOfCode


import org.scalatest.FunSuite

class Day1_DataTypes extends FunSuite {

  object Solution {

    import java.util.Scanner

    def main(args: Array[String]) {
      val i = 4
      val d = 4.0
      val s = "HackerRank "

      val scan = new Scanner(System.in)

      /* Declare second integer, double, and String variables. */
      var i2 = 0
      var d2 = 0.0
      var s2 = ""

      /* Read and save an integer, double, and String to your variables.*/
      i2 = scan.nextLine().toInt
      d2 = scan.nextLine().toDouble
      s2 = scan.nextLine()

      /* Print the sum of both integer variables on a new line. */
      println(i + i2)

      /* Print the sum of the double variables on a new line. */
      println(d + d2)

      /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */
      println(s + s2)

      scan.close()
    }
  }

  test("Run solution") {
    Solution.main(null)
  }
}


