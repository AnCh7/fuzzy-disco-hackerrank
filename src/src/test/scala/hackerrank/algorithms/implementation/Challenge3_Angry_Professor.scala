package hackerrank.algorithms.implementation.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

@RunWith(classOf[JUnitRunner])
class Challenge3_Angry_Professor extends FunSuite {

  object Solution {

    //import java.util.Scanner

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
}