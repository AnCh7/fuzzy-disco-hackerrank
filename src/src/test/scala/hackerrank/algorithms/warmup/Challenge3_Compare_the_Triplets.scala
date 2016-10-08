package hackerrank.algorithms.warmup.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge3_Compare_the_Triplets extends FunSuite {

  //import java.util.Scanner
  import scala.collection.mutable.ArrayBuffer

  object Solution {
    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val a0 = sc.nextInt()
      val a1 = sc.nextInt()
      val a2 = sc.nextInt()
      val b0 = sc.nextInt()
      val b1 = sc.nextInt()
      val b2 = sc.nextInt()

      val alice = new ArrayBuffer[Int]()
      alice += (a0, a1, a2)
      val bob = new ArrayBuffer[Int]()
      bob += (b0, b1, b2)

      val aScore = new ArrayBuffer[Int]()
      val bScore = new ArrayBuffer[Int]()

      for (i <- 0 until 3) {
        if (alice(i) > bob(i)) aScore += 1
        else if (bob(i) > alice(i)) bScore += 1
      }

      Console.println(aScore.sum + " " + bScore.sum)
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "5", "6", "7",
      "3", "6", "10"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1 1"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}