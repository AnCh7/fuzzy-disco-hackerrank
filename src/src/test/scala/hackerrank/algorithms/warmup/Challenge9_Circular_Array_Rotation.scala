package hackerrank.algorithms.warmup.scala

import hackerrank.helper.scala.{Console, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge9_Circular_Array_Rotation extends FunSuite {

  object Solution {

    //import java.util.Scanner

    class RingBuffer[A](val index: Int, val data: IndexedSeq[A]) extends IndexedSeq[A] {
      def left = new RingBuffer((index + 1) % data.size, data)
      def right = new RingBuffer((index + data.size - 1) % data.size, data)
      def length = data.length
      def apply(i: Int) = data((index + i) % data.size)
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

      var rb = new RingBuffer(0, elements)

      for (elem <- 0 until k) {
        rb = rb.right
      }

      for (elem <- queries) {
        Console.println(rb(elem))
      }
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

    val source = scala.io.Source.fromFile("D:\\Programming\\Repositories\\fuzzy-disco-hackerrank\\src\\src\\test\\scala\\hackerrank\\algorithms\\warmup\\Challenge9_Circular_Array_Rotation.txt")
    val lines = source.getLines()

    val inputData = mutable.Queue[String]()
    lines.foreach(x => inputData.enqueue(x))

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "74371",
      "78843",
      "63602",
      "52078",
      "31578",
      "59728",
      "69625",
      "49456",
      "26030",
      "64093",
      "43850",
      "14006",
      "15211",
      "28727",
      "94015",
      "30713",
      "58916",
      "64654",
      "67009",
      "85494",
      "58160",
      "18417",
      "59026",
      "78147",
      "83500",
      "47330",
      "73251",
      "32372",
      "60624",
      "34918",
      "76556",
      "10111",
      "25652",
      "73671",
      "82144",
      "23650",
      "6777",
      "21681",
      "92709",
      "28208",
      "11313",
      "98077",
      "87872",
      "32668",
      "23045",
      "45863",
      "80196",
      "96813",
      "4048",
      "25046",
      "41201",
      "69384",
      "62786",
      "4686",
      "31209",
      "3111",
      "64762",
      "30520",
      "84389",
      "64102",
      "23146",
      "61995",
      "33564",
      "2631",
      "85936",
      "89406",
      "16967",
      "39692",
      "69815",
      "26168",
      "59536",
      "98432",
      "775",
      "72984",
      "9817",
      "48591",
      "47109",
      "44571",
      "87328",
      "60310",
      "80497",
      "33775",
      "36925",
      "54674",
      "1993",
      "91508",
      "35284",
      "31332",
      "96640",
      "7618",
      "51502",
      "20020",
      "73067",
      "93813",
      "69978",
      "83988",
      "26014",
      "25823",
      "58809",
      "29652",
      "552",
      "52669",
      "60453",
      "13528",
      "56957",
      "87732",
      "94004",
      "80349",
      "75355",
      "44942",
      "9429",
      "80461",
      "46495",
      "48251",
      "20612",
      "70693",
      "28255",
      "93370",
      "75528",
      "58925",
      "21826",
      "41618",
      "85198",
      "73826",
      "69959",
      "15264",
      "51091",
      "29817",
      "62650",
      "86393",
      "19040",
      "27491",
      "1844",
      "4666",
      "85182",
      "34045",
      "43402",
      "36574",
      "23495",
      "22889",
      "77942",
      "31545",
      "37939",
      "24131",
      "52221",
      "58724",
      "60843",
      "46350",
      "3727",
      "87853",
      "54331",
      "45604",
      "1780",
      "89688",
      "89491",
      "28142",
      "68472",
      "61085",
      "88729",
      "6856",
      "91637",
      "5194",
      "24118",
      "53631",
      "86326",
      "28998",
      "36617",
      "61874",
      "58962",
      "34734",
      "34227",
      "13300",
      "77433",
      "90099",
      "4596",
      "29264",
      "82755",
      "45000",
      "80126",
      "11935",
      "51051",
      "28215",
      "48963",
      "99588",
      "62469",
      "34165",
      "86929",
      "86990",
      "86388",
      "73834",
      "22721",
      "13904",
      "70744",
      "36174",
      "17540",
      "46308",
      "12221",
      "93411",
      "16273",
      "4711",
      "66945",
      "19237",
      "82160",
      "86911",
      "31702",
      "30379",
      "3286",
      "69636",
      "19762",
      "45716",
      "95853",
      "41932",
      "94844",
      "56830",
      "6079",
      "50924",
      "73487",
      "20820",
      "30729",
      "12688",
      "54371",
      "553",
      "69158",
      "44548",
      "44417",
      "44713",
      "3823",
      "53936",
      "1713",
      "62181",
      "13127",
      "68307",
      "11825",
      "70946",
      "36464",
      "39234",
      "32380",
      "36609",
      "75688",
      "95221",
      "77166",
      "53959",
      "12727",
      "44696",
      "40953",
      "3693",
      "85248",
      "1607",
      "49893",
      "33128",
      "57877",
      "16783",
      "94366",
      "78177",
      "40526",
      "19997",
      "46585",
      "97104",
      "97547",
      "58743",
      "61391",
      "79522",
      "44682",
      "2341",
      "16104",
      "62637",
      "84711",
      "3735",
      "32540",
      "59899",
      "6113",
      "63920",
      "15149",
      "36914",
      "93426",
      "19888",
      "54714",
      "10076",
      "82798",
      "58578",
      "42194",
      "72323",
      "92532",
      "55954",
      "25065",
      "48767",
      "37641",
      "92557",
      "22339",
      "38235",
      "16922",
      "28941",
      "27500",
      "76432",
      "32420",
      "28003",
      "20648",
      "65561",
      "1451",
      "28294",
      "2086",
      "91159",
      "29546",
      "12169",
      "66825",
      "24280",
      "93008",
      "8007",
      "78205",
      "80810",
      "92681",
      "59635",
      "76231",
      "15804",
      "75452",
      "89198",
      "32052",
      "63597",
      "72415",
      "29151",
      "1119",
      "12021",
      "52545",
      "14505",
      "84508",
      "5114",
      "13400",
      "10587",
      "53878",
      "77463",
      "59120",
      "10440",
      "62639",
      "36915",
      "3977",
      "99891",
      "44973",
      "9574",
      "27600",
      "42088",
      "39166",
      "99801",
      "91766",
      "89279",
      "95754",
      "9854",
      "83681",
      "37903",
      "15294",
      "19348",
      "51751",
      "79659",
      "55509",
      "53008",
      "58208",
      "27024",
      "91590",
      "33981",
      "68445",
      "6281",
      "69555",
      "86364",
      "27419",
      "15608",
      "73517",
      "28025",
      "46938",
      "61936",
      "62876",
      "72448",
      "26186",
      "54843",
      "6926",
      "20824",
      "39635",
      "70676",
      "56053",
      "22275",
      "75111",
      "63143",
      "64850",
      "91586",
      "28763",
      "10745",
      "48609",
      "28589",
      "42609",
      "43029",
      "2093",
      "63962",
      "66932",
      "54625",
      "95902",
      "62065",
      "93432",
      "59372",
      "45636",
      "64631",
      "34872",
      "48864",
      "91480",
      "4331",
      "2792",
      "5000",
      "80030",
      "2060",
      "17567",
      "44433",
      "45834",
      "61050",
      "57499",
      "19689",
      "90613",
      "58386",
      "66919",
      "54914",
      "37928",
      "34364",
      "19519",
      "3068",
      "22546",
      "26874",
      "33321",
      "63151",
      "34287",
      "60165",
      "43455",
      "2351",
      "10938",
      "79988",
      "61275",
      "60900",
      "17694",
      "39616",
      "47596",
      "3888",
      "10464",
      "98553",
      "47017",
      "25840",
      "8983",
      "18047",
      "2808",
      "50975",
      "37644",
      "28463",
      "5201",
      "74088",
      "12042",
      "4246",
      "40157",
      "35674",
      "13048",
      "99468",
      "35280",
      "56417",
      "57733",
      "76648",
      "46726",
      "29704",
      "41636",
      "95091",
      "38496",
      "40765",
      "62944",
      "33981",
      "60284",
      "73277",
      "73492",
      "71871",
      "85198",
      "59168",
      "51977",
      "90262",
      "64070",
      "82622",
      "89003",
      "38943",
      "32264",
      "87361",
      "68893",
      "37430",
      "88418",
      "5180",
      "8213",
      "66028",
      "111",
      "22914",
      "23311",
      "97956",
      "23637",
      "6663",
      "18780",
      "66423",
      "13793",
      "27786",
      "29624",
      "74386",
      "95611",
      "1988"
    )

    Console.setOutputData(outputData)
    Solution.main(null)
  }
}