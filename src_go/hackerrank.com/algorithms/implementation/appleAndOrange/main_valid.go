package main

import "fmt"

func mainValid() {

	var s, t, a, b, m, n int
	fmt.Scan(&s)
	fmt.Scan(&t)
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&m)
	fmt.Scan(&n)

	var res1, res2 int
	for i := 0; i < m; i++ {
		var mi int
		fmt.Scan(&mi)
		if dist := mi + a; dist >= s && dist <= t {
			res1++
		}
	}

	for i := 0; i < n; i++ {
		var ni int
		fmt.Scan(&ni)
		if dist := ni + b; dist >= s && dist <= t {
			res2++
		}
	}

	fmt.Println(res1)
	fmt.Println(res2)
}
