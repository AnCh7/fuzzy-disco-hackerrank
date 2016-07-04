package Common

trait IConsole {
  def readLine(): Unit
  def Write(obj: Object): Unit
  def Write(str: String, args: Object*): Unit
  def WriteLine(): Unit
  def WriteLine(obj: Object): Unit
  def WriteLine(format: String, args: Object*): Unit
}

trait ITestableConsole {
  def setInputData(str: String*): Unit
  def getOutputData(): List[String]
}

trait Runnable {
  def run(console: ITestableConsole): Unit
}

trait RunnableImpl[T] extends Runnable {

  val inputData: T
  val expectedData: T
  val console: IConsole

  def run(console: ITestableConsole): Unit

  def main(args: Array[String]): Unit

  def checkData(inputData: List[String], expectedData: List[String], providedData: List[String]): Unit = {

    println("===Inputs:")
    inputData.foreach(x => println(x))

    println("===Expected:")
    expectedData.foreach(x => println(x))

    println("===Provided:")
    providedData.foreach(x => println(x))

    println("===Result:")

    var result = true

    def checkData {
      for (i <- 0 to providedData.length) {
        val line1 = providedData.indexOf(i)
        val line2 = expectedData.indexOf(i)
        if (!line1.equals(line2)) {
          result = false
          return
        }
      }
    }

    if (providedData.length == expectedData.length) {
      checkData
    }
    else result = false

    if (result) println("OK")
    else println("FAIL")
  }
}

