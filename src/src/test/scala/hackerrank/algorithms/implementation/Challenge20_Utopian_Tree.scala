package hackerrank.algorithms.implementation.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge20_Utopian_Tree extends FunSuite {

  object Solution {

    def process(height: Int, isSpring: Boolean, cycles: Int): Int = {
      if (cycles > 0) {
        if (isSpring) process(height * 2, isSpring = false, cycles - 1)
        else process(height + 1, isSpring = true, cycles - 1)
      }
      else height
    }

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val t = sc.nextInt()
      if (t >= 1 && t <= 10) {
        for (i <- 0 until  t) {
          val n = sc.nextInt()
          if (n >= 0 && n <= 60) {
            n match {
              case 0 => Console.println(1)
              case _ => Console.println(process(1, isSpring = true, n))
            }
          }
        }
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "3",
      "0",
      "1",
      "4"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1",
      "2",
      "7"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}