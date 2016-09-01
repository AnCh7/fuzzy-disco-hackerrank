package hackerrank.algorithms.dynamicProgramming.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge1_Fibonacci_Modified extends FunSuite {

  object Solution {

    //import java.util.Scanner
    import scala.collection.mutable.ArrayBuffer

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)

      val t1 = sc.nextInt()
      val t2 = sc.nextInt()
      val n = sc.nextInt()

      if ((t1 >= 0 && t1 <= 2) && (t2 >= 0 && t2 <= 2) && (n >= 3 && n <= 20)) {

        val f = ArrayBuffer[BigInt]()
        f += t1
        f += t2

        for (i <- 2 until n) {
          f += f(i - 2) + (f(i - 1) * f(i - 1))
        }

        Console.println(f(n - 1))
      }
    }
  }

  test("Sample Input") {

    val inputData = mutable.Queue(
      "0 1 5"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "5"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}