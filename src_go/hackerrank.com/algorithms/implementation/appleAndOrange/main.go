package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func sliceAtoi(sa []string) ([]int, error) {
	si := make([]int, 0, len(sa))
	for _, a := range sa {
		i, err := strconv.Atoi(a)
		if err != nil {
			return si, err
		}
		si = append(si, i)
	}
	return si, nil
}

func nextText(scan *bufio.Scanner) string {
	scan.Scan()
	return scan.Text()
}

func process(scan *bufio.Scanner) (string, string) {

	s, _ := strconv.Atoi(nextText(scan))
	t, _ := strconv.Atoi(nextText(scan))
	a, _ := strconv.Atoi(nextText(scan))
	b, _ := strconv.Atoi(nextText(scan))
	m, _ := strconv.Atoi(nextText(scan))
	n, _ := strconv.Atoi(nextText(scan))

	var res1, res2 int

	// Apples
	for i := 0; i < m; i++ {
		ni, _ := strconv.Atoi(nextText(scan))
		if dist := ni + a; dist >= s && dist <= t {
			res1++
		}
	}

	// Oranges
	for i := 0; i < n; i++ {
		mi, _ := strconv.Atoi(nextText(scan))
		if dist := mi + b; dist >= s && dist <= t {
			res2++
		}
	}

	return strconv.Itoa(res1), strconv.Itoa(res2)
}

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	result1, result2 := process(scanner)
	fmt.Println(result1)
	fmt.Println(result2)
}
