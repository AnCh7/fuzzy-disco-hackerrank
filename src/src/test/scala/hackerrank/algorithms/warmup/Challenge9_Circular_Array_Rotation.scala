package hackerrank.algorithms.warmup.scala

import hackerrank.helper.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge9_Circular_Array_Rotation extends FunSuite {

  object Solution {

    //import java.util.Scanner

    class RingBuffer[A](var offset: Int, data: IndexedSeq[A]) extends IndexedSeq[A] {
      def length = data.length
      def apply(i: Int) = index(i)

      def index(i: Int): A = {
        if (i >= length || i < 0) throw new Exception("Invalid parameter")
        val newIndex = i - offset
        if (newIndex < 0) data(length + newIndex)
        else if (newIndex >= length) data(length - newIndex)
        else data(newIndex)
      }

      def right() = {
        offset += 1
        if (offset >= length) offset = 0
      }
    }

    def main(args: Array[String]) {

      val sc = new Scanner(System.in)
      val n = sc.nextInt() // elements in array
      val k = sc.nextInt() // transformations count
      val q = sc.nextInt() // queries count

      var queries = List[Int]()
      var elements = IndexedSeq[Int]()

      if (n <= math.pow(10, 5) && n >= 1 && k <= math.pow(10, 5) && k >= 1 && q <= 500 && q >= 1) {

        for (elem <- 0 until n) {
          val a = sc.nextInt()
          if (a <= math.pow(10, 5) && a >= 1) {
            elements = elements :+ a
          }
        }

        for (elem <- 0 until q) {
          val m = sc.nextInt()
          if (m <= n - 1 && m >= 0) {
            queries = queries :+ m
          }
        }
      }

      val rb = new RingBuffer(0, elements)
      for (elem <- 0 until k) rb.right()
      for (elem <- queries) Console.println(rb(elem))
    }
  }

  test("Run solution") {
    val inputData = mutable.Queue(
      "3 2 3",
      "1 2 3",
      "0",
      "1",
      "2"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "2",
      "3",
      "1"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 0") {
    val inputData = mutable.Queue(
      "51 51 100",
      "39356 87674 16667 54260 43958 70429 53682 6169 87496 66190 90286 4912 44792 65142 36183 43856 77633 38902 1407 88185 80399 72940 97555 23941 96271 49288 27021 32032 75662 69161 33581 15017 56835 66599 69277 17144 37027 39310 23312 24523 5499 13597 45786 66642 95090 98320 26849 72722 37221 28255 60906",
      "47",
      "10",
      "12",
      "13",
      "6",
      "29",
      "22",
      "17",
      "7",
      "3",
      "30",
      "45",
      "1",
      "21",
      "50",
      "17",
      "25",
      "42",
      "5",
      "6",
      "47",
      "2",
      "24",
      "1",
      "6",
      "14",
      "24",
      "43",
      "7",
      "2",
      "35",
      "3",
      "13",
      "22",
      "16",
      "19",
      "0",
      "12",
      "10",
      "32",
      "41",
      "14",
      "1",
      "42",
      "35",
      "0",
      "9",
      "34",
      "17",
      "14",
      "15",
      "38",
      "17",
      "13",
      "40",
      "48",
      "27",
      "38",
      "41",
      "8",
      "14",
      "25",
      "11",
      "27",
      "47",
      "2",
      "20",
      "22",
      "39",
      "4",
      "28",
      "29",
      "43",
      "29",
      "21",
      "1",
      "4",
      "4",
      "10",
      "46",
      "43",
      "50",
      "33",
      "34",
      "12",
      "47",
      "32",
      "13",
      "8",
      "47",
      "22",
      "23",
      "21",
      "33",
      "24",
      "43",
      "35",
      "19",
      "39",
      "24"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "72722",
      "90286",
      "44792",
      "65142",
      "53682",
      "69161",
      "97555",
      "38902",
      "6169",
      "54260",
      "33581",
      "98320",
      "87674",
      "72940",
      "60906",
      "38902",
      "49288",
      "45786",
      "70429",
      "53682",
      "72722",
      "16667",
      "96271",
      "87674",
      "53682",
      "36183",
      "96271",
      "66642",
      "6169",
      "16667",
      "17144",
      "54260",
      "65142",
      "97555",
      "77633",
      "88185",
      "39356",
      "44792",
      "90286",
      "56835",
      "13597",
      "36183",
      "87674",
      "45786",
      "17144",
      "39356",
      "66190",
      "69277",
      "38902",
      "36183",
      "43856",
      "23312",
      "38902",
      "65142",
      "5499",
      "37221",
      "32032",
      "23312",
      "13597",
      "87496",
      "36183",
      "49288",
      "4912",
      "32032",
      "72722",
      "16667",
      "80399",
      "97555",
      "24523",
      "43958",
      "75662",
      "69161",
      "66642",
      "69161",
      "72940",
      "87674",
      "43958",
      "43958",
      "90286",
      "26849",
      "66642",
      "60906",
      "66599",
      "69277",
      "44792",
      "72722",
      "56835",
      "65142",
      "87496",
      "72722",
      "97555",
      "23941",
      "72940",
      "66599",
      "96271",
      "66642",
      "17144",
      "88185",
      "24523",
      "96271"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }

  test("Run solution 5") {

    val source = scala.io.Source.fromFile("D:\\Programming\\Repositories\\fuzzy-disco-hackerrank\\" +
      "src\\src\\test\\scala\\hackerrank\\algorithms\\warmup\\Challenge9_Circular_Array_Rotation_Input.txt")
    val lines = source.getLines()

    val inputData = mutable.Queue[String]()
    lines.foreach(x => inputData.enqueue(x))

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val source2 = scala.io.Source.fromFile("D:\\Programming\\Repositories\\fuzzy-disco-hackerrank\\" +
      "src\\src\\test\\scala\\hackerrank\\algorithms\\warmup\\Challenge9_Circular_Array_Rotation_Output.txt")
    val lines2 = source2.getLines()

    val outputData = mutable.Queue[String]()
    lines2.foreach(x => outputData.enqueue(x))

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}