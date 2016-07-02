package ThirtyDaysOfCode

class Day2_Operators {

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

      val tip = mealCost * (tipPercent / 100)
      val tax = mealCost * (taxPercent / 100)
      val totalCost = (mealCost + tip + tax).toInt

      println(s"The total meal cost is $totalCost dollars.")

    }

    import org.scalatest.FunSuite
    import org.junit.runner.RunWith
    import org.scalatest.junit.JUnitRunner

    @RunWith(classOf[JUnitRunner])
    class BalanceSuite extends FunSuite {

      test("balance: '(if (zero? x) max (/ 1 x))' is balanced") {
        assert(true)
      }
    }

    import org.junit._
    import Assert._

    class MyTest {

      @Test
      def test = assert(false)
    }



  }




}