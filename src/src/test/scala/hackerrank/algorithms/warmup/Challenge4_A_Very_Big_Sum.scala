package hackerrank.algorithms.warmup.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge4_A_Very_Big_Sum extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val n = sc.nextInt()
      val arr = new Array[Int](n)
      for (arr_i <- 0 until n) {
        arr(arr_i) = sc.nextInt()
      }

      val bInt = arr.map(x => BigInt(x))
      Console.println(bInt.sum)
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "5",
      "1000000001",
      "1000000002",
      "1000000003",
      "1000000004",
      "1000000005"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "5000000015"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}