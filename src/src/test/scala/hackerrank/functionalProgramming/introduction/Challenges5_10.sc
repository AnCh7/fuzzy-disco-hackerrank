// 5. Filter Array
def f5(delim: Int, arr: List[Int]): List[Int] = {
  arr.filter(x => x < delim)
}

// 6. Filter Positions in a List
def f6(arr: List[Int]): List[Int] = {
  arr.sliding(2, 2).filter(x => x.length > 1).map(x => x.last).toList
}

// 28 3 26 25 15 11 24
f6(List(19, 28, 27, 3, 27, 26, 24, 25, 11, 15, 23, 11, 20, 24, 15))

// 7. Array Of N Elements
def f7(num: Int): List[Int] = {
  (1 to num).toList
}

import scala.collection.mutable.ArrayBuffer

// 8. Reverse a List
def f8(arr: List[Int]): List[Int] = {
  val t = ArrayBuffer[Int]()
  for (i <- arr.length - 1 to 0 by -1) {
    t += arr(i)
  }
  t.toList
}

f8(List(19, 22, 3, 28, 26, 17, 18, 4, 28, 0))

// 9. Sum of Odd Elements
def isEven(number: Int) = number % 2 == 0
def isOdd(number: Int) = !isEven(number)
def f9(arr: List[Int]): Int = {
  arr.filter(isOdd).sum
}

f9(List(3, 2, 4, 6, 5, 7, 8, 0, 1))

// 39
f9(List(11, 25, 18, -1, 26, -20, -19, 23, -24, -8))

// 10. List Length
def f10(arr: List[Int]): Int = {
  var counter = 0
  for (elem <- arr) {
    counter = counter + 1
  }
  counter
}

