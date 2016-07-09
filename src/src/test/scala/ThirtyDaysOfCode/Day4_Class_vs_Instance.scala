package ThirtyDaysOfCode

import Infrastructure.HackersHelper.{Console, StdIn}
import org.scalatest.FunSuite

class Day4_Class_vs_Instance extends FunSuite {

  class Person {

    var age: Int = 0

    def this(initialAge: Int) = {
      this()
      if (initialAge <= 30 && initialAge >= -5) {
        if (initialAge >= 0) age = initialAge
        else {
          age = 0
          Console.println("Age is not valid, setting age to 0.")
        }
      }
    }

    def amIOld(): Unit = {
      if (age < 13) Console.println("You are young.")
      else if (age >= 13 && age < 18) Console.println("You are a teenager.")
      else Console.println("You are old.")
    }

    def yearPasses(): Unit = {
      age += 1
    }
  }

  object Solution {

    //import scala.io.StdIn

    def main(args: Array[String]) {

      val T = StdIn.readInt()

      for (i <- 1 to T) {

        val age = StdIn.readInt()
        val person = new Person(age)
        person.amIOld()

        for (j <- 1 to 3) {
          person.yearPasses()
        }

        person.amIOld()
        Console.println()
      }
    }
  }

  test("Run solution") {

    // Injecting input data from HackerRank challenge
    val inputData = List(
      "4",
      "-1",
      "10",
      "16",
      "18"
    )

    StdIn.setInputData(inputData)

    // Injecting output data from HackerRank challenge
    val outputData = List(
      "Age is not valid, setting age to 0.",
      "You are young.",
      "You are young.",
      "You are young.",
      "You are a teenager.",
      "You are a teenager.",
      "You are old.",
      "You are old.",
      "You are old."
    )
    Console.setOutputData(outputData)

    // Running challenge
    Solution.main(null)
  }
}