package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func maxMin(arr []int) (int, int) {
	min, max := arr[0], arr[0]
	for _, v := range arr {
		if v > max {
			max = v
		}
		if v < min {
			min = v
		}
	}
	return max, min
}

func process(input1 string, input2 string) string {
	const letters = "abcdefghijklmnopqrstuvwxyz"

	splt := strings.Split(input1, " ")
	nums := make([]int, len(splt))
	for i, v := range splt {
		e, _ := strconv.Atoi(v)
		nums[i] = e
	}

	m := make(map[string]int)
	for i, v := range nums {
		m[string(letters[i])] = v
	}

	// Find letters' heights
	heights := make([]int, len(input2))
	for i := 0; i < len(input2); i++ {
		if v, ok := m[string(input2[i])]; ok {
			heights[i] = v
		}
	}

	max, _ := maxMin(heights)
	area := len(input2) * max
	return strconv.Itoa(area)
}

func main() {
	bio := bufio.NewReader(os.Stdin)

	input1, _, err1 := bio.ReadLine()
	if err1 != nil {
		fmt.Println(err1)
		return
	}

	input2, _, err2 := bio.ReadLine()
	if err2 != nil {
		fmt.Println(err2)
		return
	}

	result := process(string(input1[:]), string(input2[:]))
	fmt.Println(result)
}
