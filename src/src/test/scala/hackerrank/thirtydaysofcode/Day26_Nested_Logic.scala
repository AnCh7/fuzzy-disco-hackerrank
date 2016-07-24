package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day26_Nested_Logic extends FunSuite {

  object Solution {

    //import java.util.Scanner
    import java.util.Calendar

    def main(args: Array[String]) {

      case class Date(day: Int, month: Int, year: Int)

      def checkGregorianCalendar(day: Int, month: Int, year: Int): Boolean = {
        val d = day
        val m = month - 1
        val y = year

        val cal = Calendar.getInstance()
        cal.set(Calendar.YEAR, y)
        cal.set(Calendar.MONTH, m)
        cal.set(Calendar.DATE, d)

        if (cal.get(Calendar.DATE) == d &&
          cal.get(Calendar.MONTH) == m &&
          cal.get(Calendar.YEAR) == y) {
          true
        }
        else false
      }

      def checkInputDate(day: Int, month: Int, year: Int): Boolean = {
        if ((day <= 31 && day >= 1) &&
          (month <= 12 && month >= 1) &&
          (year <= 3000 && year >= 1)) {
          true
        }
        else false
      }

      val sc = new Scanner(System.in)
      val input1 = sc.nextLine().split(" ").map(x => x.toInt)
      val input2 = sc.nextLine().split(" ").map(x => x.toInt)

      if (checkInputDate(input1(0), input1(1), input1(2)) && checkGregorianCalendar(input1(0), input1(1), input1(2)) &&
        checkInputDate(input2(0), input2(1), input2(2)) && checkGregorianCalendar(input2(0), input2(1), input2(2))) {

        val actualDate = new Date(input1(0), input1(1), input1(2))
        val expectedDate = new Date(input2(0), input2(1), input2(2))

        val beforeDay = actualDate.day <= expectedDate.day
        val sameDay = actualDate.day == expectedDate.day

        val beforeMonth = actualDate.month <= expectedDate.month
        val sameMonth = actualDate.month == expectedDate.month

        val beforeYear = actualDate.year <= expectedDate.year
        val sameYear = actualDate.year == expectedDate.year

        var fine = 0

        if (!beforeYear) fine = 10000
        else {
          if (sameYear) {
            if (!beforeMonth) fine = (actualDate.month - expectedDate.month) * 500
            else if (!beforeDay) fine = (actualDate.day - expectedDate.day) * 15
          }
        }
        Console.println(fine)
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "9 6 2015",
      "6 6 2015"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "45"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 3") {
    val inputData = mutable.Queue(
      "31 12 2009",
      "1 1 2010"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "0"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}