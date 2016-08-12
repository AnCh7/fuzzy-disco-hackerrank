package hackerrank.algorithms.implementation.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge1_Kangaroo extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val input = sc.nextLine().split(" ").map(_.toInt)

      val x1 = input(0)
      val v1 = input(1)
      val x2 = input(2)
      val v2 = input(3)

      if (x1 >= 0 && x2 <= 10000 && x1 < x2 && v1 >= 1 && v1 <= 10000 && v2 >= 1 && v2 <= 10000) {

        val l1 = Stream.from(x1, v1)
        val l2 = Stream.from(x2, v2)

        for (elem <- Stream.from(1)) {

          if (v1 == v2) {
            Console.println("NO")
            return
          }

          val move1 = l1(elem)
          val move2 = l2(elem)

          if (move1 == move2) {
            Console.println("YES")
            return
          }

          if (move1 > move2) {
            Console.println("NO")
            return
          }

          val prevMove1 = l1(elem - 1)
          val prevMove2 = l2(elem - 1)
          if ((move2 - move1) > (prevMove2 - prevMove1)) {
            Console.println("NO")
            return
          }
        }
      }
    }
  }

  test("Run solution 1") {
    val inputData = mutable.Queue(
      "0 3 4 2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "YES"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 2") {
    val inputData = mutable.Queue(
      "0 2 5 3"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "NO"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 3") {
    val inputData = mutable.Queue(
      "21 6 47 3"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "NO"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 10") {
    val inputData = mutable.Queue(
      "43 2 70 2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "NO"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 11") {
    val inputData = mutable.Queue(
      "4523 8092 9419 8076"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "YES"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}