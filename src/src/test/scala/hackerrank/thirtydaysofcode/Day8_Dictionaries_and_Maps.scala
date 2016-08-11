package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.scala._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day8_Dictionaries_and_Maps extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)

      val n = sc.nextLine()
      if (!n.isEmpty) {

        val count = n.toInt
        if (count <= math.pow(10, 5) && count >= 1) {

          val storage = collection.mutable.Map[String, String]()

          for (_ <- 1 to count) {

            val entry = sc.nextLine().split(" ")
            val name = entry.head
            val phone = entry.last

            if (!name.isEmpty) {
              storage += (name -> phone)
            }
          }

          if (storage.isEmpty) return

          var query = 1
          while (query <= math.pow(10, 5)) {

            val key = sc.nextLine()
            if (key.isEmpty) return

            val value = storage.get(key)
            value match {
              case Some(x) => Console.println(key + "=" + x)
              case None => Console.println("Not found")
            }

            query += 1
          }
        }
      }
    }
  }

  test("Run solution") {

    // Injecting input data from HackerRank challenge
    val inputData = mutable.Queue(
      "3",
      "sam 99912222",
      "tom 11122222",
      "harry 12299933",
      "sam",
      "edward",
      "harry"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    // Injecting output data from HackerRank challenge
    val outputData = mutable.Queue(
      "sam=99912222",
      "Not found",
      "harry=12299933"
    )

    Console.setOutputData(outputData)

    // Running challenge
    Solution.main(null)
  }
}