package ThirtyDaysOfCode

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
          println("Age is not valid, setting age to 0.")
        }
      }
    }

    def amIOld(): Unit = {
      if (age < 13) println("You are young.")
      else if (age >= 13 && age < 18) println("You are a teenager.")
      else println("You are old.")
    }

    def yearPasses(): Unit = {
      age += 1
    }
  }

  import scala.io.StdIn

  object Solution {

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
        println()
      }
    }
  }

  test("Run solution") {
    Solution.main(null)
  }
}