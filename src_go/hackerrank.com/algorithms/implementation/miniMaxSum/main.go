package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func sum(arr [5]int) int {
	var sum int
	for i := 0; i < len(arr); i++ {
		sum = sum + arr[i]
	}
	return sum
}

func process(input string) string {

	s := strings.Split(input, " ")
	a, b, c, d, e := s[0], s[1], s[2], s[3], s[4]
	ai, _ := strconv.Atoi(a)
	bi, _ := strconv.Atoi(b)
	ci, _ := strconv.Atoi(c)
	di, _ := strconv.Atoi(d)
	ei, _ := strconv.Atoi(e)
	arr := [5]int{ai, bi, ci, di, ei}

	var remember int
	var arrSum [5]int

	for i := 0; i < len(arr); i++ {
		remember = arr[i]
		arr[i] = 0
		arrSum[i] = sum(arr)
		arr[i] = remember
	}

	max := 0
	min := arrSum[0]
	for k := 0; k < len(arrSum); k++ {
		if max < arrSum[k] {
			max = arrSum[k]
		}
		if min > arrSum[k] {
			min = arrSum[k]
		}
	}
	return strconv.Itoa(min) + " " + strconv.Itoa(max)
}

func main() {
	bio := bufio.NewReader(os.Stdin)
	line, _, err := bio.ReadLine()
	if err != nil {
		fmt.Println(err)
		return
	}
	result := process(string(line[:]))
	fmt.Println(result)
}
