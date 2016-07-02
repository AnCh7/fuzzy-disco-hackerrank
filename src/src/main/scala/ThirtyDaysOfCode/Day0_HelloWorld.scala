package ThirtyDaysOfCode

class Day0_HelloWorld {

  object Solution {

    import java.util.Scanner

    def main(args: Array[String]): Unit = {

      // Create a Scanner object to read input from stdin.
      val scan = new Scanner(System.in)

      // Read a full line of input from stdin and save it to our variable, inputString.
      var inputString = scan.nextLine()

      // Close the scanner object, because we've finished reading
      // all of the input from stdin needed for this challenge.
      scan.close()

      println("Hello, World.")
      println(inputString)
    }
  }

}