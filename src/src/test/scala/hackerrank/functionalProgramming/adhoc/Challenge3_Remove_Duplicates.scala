package hackerrank.functionalProgramming.adhoc.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge3_Remove_Duplicates extends FunSuite {

  object Solution {

    // import java.util.Scanner
    import scala.collection.mutable

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val a = sc.nextLine()

      var linkedHashSet = mutable.LinkedHashSet[Char]()
      linkedHashSet = linkedHashSet ++ a.toCharArray

      Console.println(linkedHashSet.mkString(""))
    }
  }

  test("Test Case #2") {

    val inputData = mutable.Queue(
      "hskimnjwlqfqdviolaengwnxlecvtefrsjwhemlyhnuppgexfsxexcckqdkalhkrepvylomoiqezsibgvgicustsfvqtcficascp"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "hskimnjwlqfdvoaegxctryupzb"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}