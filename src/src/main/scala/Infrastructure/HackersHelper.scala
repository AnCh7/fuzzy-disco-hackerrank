package Infrastructure

object HackersHelper {

  object StdIn {

    private var input: List[String] = List()

    private def getNext() = {
      val elem = input.head
      input = input.tail
      elem
    }

    def setInputData(in: List[String]) = input = in
    def readInt(): Int = getNext().toInt
    def readLine() = getNext()
  }

  class InputStream {

    private var input: List[String] = List()

    private def getNext() = {
      val elem = input.head
      input = input.tail
      elem
    }

    def setInputData(in: List[String]) = input = in
    def getNextString(): String = this.getNext()
    def getNextInt(): Int = getNext().toInt
  }

  object System {
    private var _in: InputStream = null

    def setIn(in: InputStream) = _in = in
    def in(): InputStream = _in
  }

  class Scanner(in: InputStream) {
    def nextInt() = in.getNextInt()
    def nextString() = in.getNextString()
    def nextLine() = in.getNextString()
  }

  object Console {

    private var output: List[String] = List()

    def setOutputData(out: List[String]) = output = out
    def println() = {}
    def println(x: Any) = {
      val elem = output.head
      output = output.tail
      assert(x == elem, s"$x not equals $elem")
    }
  }

}
