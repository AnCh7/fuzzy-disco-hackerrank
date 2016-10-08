package hackerrank.algorithms.warmup.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge8_Time_Conversion extends FunSuite {

  object Solution {

    //import java.util.Scanner

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val time = sc.next()

      val readFormat = new java.text.SimpleDateFormat("hh:mm:ssaa")
      val writeFormat = new java.text.SimpleDateFormat("HH:mm:ss")
      Console.println(writeFormat.format(readFormat.parse(time)))
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "07:05:45PM"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "19:05:45"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}