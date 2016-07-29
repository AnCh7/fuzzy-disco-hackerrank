package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day29_Bitwise_AND extends FunSuite {

  object Solution {

    //import java.util.Scanner
    import scala.collection.mutable.ArrayBuffer

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val T = sc.nextInt()
      if (T <= math.pow(10, 3) && T >= 1) {
        for (i <- 0 until T) {
          val N = sc.nextInt()
          val K = sc.nextInt()
          if ((N <= math.pow(10, 3) && N >= 2) &&
            (K <= N && K >= 2)) {
            var array = new ArrayBuffer[Int]()
            for (a <- 1 until N) {
              for (b <- 2 to N) {
                if (a < b) {
                  array += a & b
                }
              }
            }
            Console.println(array.filter(x => x < K).max)
          }
        }
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "3",
      "5",
      "2",
      "8",
      "5",
      "2",
      "2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "1",
      "4",
      "0"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}