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

// 11. Update List
def f11(arr: List[Int]): List[Int] = {
  arr.map(x => if (x < 0) x * -1 else x)
}

// 12. Evaluating e^x
def f12(x: Float): Float = {
  (1 + x +
    (math.pow(x, 2) / (1 * 2)) +
    (math.pow(x, 3) / (1 * 2 * 3)) +
    (math.pow(x, 4) / (1 * 2 * 3 * 4)) +
    (math.pow(x, 5) / (1 * 2 * 3 * 4 * 5)) +
    (math.pow(x, 6) / (1 * 2 * 3 * 4 * 5 * 6)) +
    (math.pow(x, 7) / (1 * 2 * 3 * 4 * 5 * 6 * 7)) +
    (math.pow(x, 8) / (1 * 2 * 3 * 4 * 5 * 6 * 7 * 8)) +
    (math.pow(x, 9) / (1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9))).toFloat
}

// 2423600.1887
f12(20.0000F)

// 13. Area Under Curves and Volume of Revolving a Curve

// This function will be used while invoking "Summation" to compute the area under the curve.
def f13(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  coefficients.indices.map(i => coefficients(i) * math.pow(x, powers(i))).sum
}

// This function will be used while invoking "Summation" to compute
// the volume of revolution of the curve around the X-Axis.
// The 'Area' referred to here is the area of the circle obtained
// by rotating the point on the curve (x,f(x)) around the X-Axis.
def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  math.Pi * math.pow(f13(coefficients, powers, x), 2)
}

// This is the part where the series is summed up.
// This function is invoked once with func = f to compute the area under the curve,
// then it is invoked again with func = area to compute the volume of revolution of the curve.
def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
  (lowerLimit.toDouble to upperLimit.toDouble by 0.001).map(func(coefficients, powers, _)).sum * 0.001
}

