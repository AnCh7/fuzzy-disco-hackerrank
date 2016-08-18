package hackerrank.algorithms.implementation.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge2_Divisible_Sum_Pairs extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      val k = sc.nextInt()
      if ((n >= 2 && n <= 100) && (k >= 1 && k <= 100)) {
        val a = new Array[Int](n)
        for (i <- 0 until n) {
          val ai = sc.nextInt()
          if (ai >= 1 && ai <= 100) {
            a(i) = ai
          }
        }

        val zip = (0 until n).zip(a)
        val comb = zip.combinations(2)
        val f1 = comb.filter(x => x.head._1 < x.last._1)
        val f2 = f1.filter(x => ((x.head._2 + x.last._2) % k) == 0)
        Console.println(f2.length)
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "6 3",
      "1 3 2 6 1 2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "5"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 1") {
    val inputData = mutable.Queue(
      "2 2",
      "8 10"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

}