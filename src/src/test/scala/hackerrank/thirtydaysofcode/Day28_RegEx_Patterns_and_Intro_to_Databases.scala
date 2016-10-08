package hackerrank.thirtydaysofcode.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day28_RegEx_Patterns_and_Intro_to_Databases extends FunSuite {

  object Solution {

    //import java.util.Scanner
    import scala.collection.mutable.ArrayBuffer

    case class Email(name: String, emailID: String)

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val N = sc.nextInt()
      if (N <= 30 && N >= 2) {
        var array = new ArrayBuffer[Email]()
        for (i <- 0 until N) {

          val input = sc.nextLine().split(" ")
          val firstName = input.head
          val emailID = input.last

          val lowerRegex = "[a-z]+".r
          val emailRegex = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r

          val fMatch = firstName.matches(lowerRegex.toString)
          val eMatch = emailID.matches(emailRegex.toString)
          val fLenght = firstName.length <= 20
          val eLenght = emailID.length <= 50

          if (fMatch && eMatch && fLenght && eLenght) {
            array += new Email(firstName, emailID)
          }
        }

        array = array.filter(s => s.emailID.endsWith("@gmail.com")).sortBy(x => x.name)
        for (elem <- array) {
          Console.println(elem.name)
        }
      }
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "6",
      "riya riya@gmail.com",
      "julia julia@julia.me",
      "julia sjulia@gmail.com",
      "julia julia@gmail.com",
      "samantha samantha@gmail.com",
      "tanya tanya@gmail.com"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "julia",
      "julia",
      "riya",
      "samantha",
      "tanya"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 2") {
    val inputData = mutable.Queue(
      "30",
      "riya riya@gmail.com",
      "julia julia@julia.me",
      "julia sjulia@gmail.com",
      "julia julia@gmail.com",
      "samantha samantha@gmail.com",
      "tanya tanya@gmail.com",
      "riya ariya@gmail.com",
      "julia bjulia@julia.me",
      "julia csjulia@gmail.com",
      "julia djulia@gmail.com",
      "samantha esamantha@gmail.com",
      "tanya ftanya@gmail.com",
      "riya riya@live.com",
      "julia julia@live.com",
      "julia sjulia@live.com",
      "julia julia@live.com",
      "samantha samantha@live.com",
      "tanya tanya@live.com",
      "riya ariya@live.com",
      "julia bjulia@live.com",
      "julia csjulia@live.com",
      "julia djulia@live.com",
      "samantha esamantha@live.com",
      "tanya ftanya@live.com",
      "riya gmail@riya.com",
      "priya priya@gmail.com",
      "preeti preeti@gmail.com",
      "alice alice@alicegmail.com",
      "alice alice@gmail.com",
      "alice gmail.alice@gmail.com"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "alice",
      "alice",
      "julia",
      "julia",
      "julia",
      "julia",
      "preeti",
      "priya",
      "riya",
      "riya",
      "samantha",
      "samantha",
      "tanya",
      "tanya"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}