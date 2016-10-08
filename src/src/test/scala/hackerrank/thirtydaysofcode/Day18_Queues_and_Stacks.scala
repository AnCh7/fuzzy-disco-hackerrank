package hackerrank.thirtydaysofcode.scala

import hackerrank.helper._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Day18_Queues_and_Stacks extends FunSuite {

  object Solution {

    class Solution {

      var _s = mutable.Stack[Char]()
      var _q = mutable.Queue[Char]()

      def pushCharacter(c: Char) = _s.push(c)
      def enqueueCharacter(c: Char) = _q.enqueue(c)
      def dequeueCharacter(): Char = _q.dequeue()
      def popCharacter(): Char = _s.pop()
    }

    import scala.util.control._

    def main(args: Array[String]) {
      // read the string s
      val s = StdIn.readLine()
      // create the Solution class object p
      val obj = new Solution()
      var i = 0
      val len = s.length()
      //push/enqueue all the characters of string s to stack
      for (i <- 0 until len) {
        obj.pushCharacter(s.charAt(i))
        obj.enqueueCharacter(s.charAt(i))
      }

      var isPalindrome = true

      /*pop the top character from stack
        dequeue the first character from queue
        compare both the characters*/
      val loop = new Breaks
      loop.breakable {
        for (i <- 0 to len / 2) {
          if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false
            loop.break
          }
        }
      }

      //finally print whether string s is palindrome or not
      if (isPalindrome) {
        Console.println("The word, " + s + ", is a palindrome.")
      }
      else {
        Console.println("The word, " + s + ", is not a palindrome.")
      }
    }
  }

  test("Run solution") {

    val inputData = mutable.Queue(
      "racecar"
    )
    StdIn.setInputData(inputData)

    val outputData = mutable.Queue(
      "The word, racecar, is a palindrome."
    )

    Console.setOutputData(outputData)

    Solution.main(null)
  }
}