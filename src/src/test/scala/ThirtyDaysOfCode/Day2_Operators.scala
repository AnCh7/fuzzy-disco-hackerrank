package ThirtyDaysOfCode

import org.scalatest.FunSuite

class Day2_Operators extends FunSuite {

  object Solution {

    import java.util.Scanner

    def main(args: Array[String]) {
      var mealCost = 12.0
      var tipPercent = 20
      var taxPercent = 8

      val scan = new Scanner(System.in)
      mealCost = scan.nextLine().toDouble
      tipPercent = scan.nextLine().toInt
      taxPercent = scan.nextLine().toInt

      val tip = mealCost * (tipPercent / 100.0)
      val tax = mealCost * (taxPercent / 100.0)
      val totalCost = Math.round(mealCost + tip + tax)

      println(s"The total meal cost is ${totalCost.toInt} dollars.")
    }
  }

  test("Run solution") {
    Solution.main(null)
  }
}

