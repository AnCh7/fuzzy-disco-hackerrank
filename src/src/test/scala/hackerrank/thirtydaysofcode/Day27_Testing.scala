package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day27_Testing extends FunSuite {

  object Solution {

    //import java.util.Scanner
    import scala.collection.mutable.ArrayBuffer

    implicit def intWithTimes(n: Int) = new {
      def times(f: => Unit) = 1 to n foreach { _ => f }
    }

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val l = sc.nextLine()
      if (!l.isEmpty) {
        val lectures = l.toInt
        if (lectures <= 5) {
          lectures times {
            val input = sc.nextLine().split(" ").map(x => x.toInt)
            val students = input.head
            if (students <= 200 && students >= 1) {

              val threshold = input.last
              if (threshold <= students && threshold >= 1) {

                val arr = new ArrayBuffer[Int](students)
                val input = sc.nextLine().split(" ").map(x => x.toInt)
                for (i <- 0 until students) {

                  val a = input(i)
                  if (a <= math.pow(10, 3) && a >= math.pow(-10, 3)) {
                    arr += a
                  }
                }

                if (arr.contains(0) || arr.exists(x => x > 0) || arr.exists(x => x < 0)) {
                  val isCanceled = arr.count(x => x <= 0) < threshold
                  if (isCanceled) Console.println("YES")
                  else Console.println("NO")
                }
              }
            }
          }
        }
      }
    }
  }

  object Solution2 {
    def main(args: Array[String]) {
      println("5")
      println("5 3")
      println("-1 90 999 100 0")
      println("4 2")
      println("0 -1 2 1")
      println("3 3")
      println("-1 0 1")
      println("6 1")
      println("-1 0 1 -1 2 3")
      println("7 3")
      println("-1 0 1 2 3 4 5")
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "2",
      "4 3",
      "-1 -3 4 2",
      "4 2",
      "0 -1 2 1"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "YES",
      "NO"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 2") {
    Solution2.main(null)
  }
}