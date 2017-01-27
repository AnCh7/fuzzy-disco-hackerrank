package main

import (
	"bufio"
	"os"
	"path/filepath"
	"testing"
)

func TestAlg(t *testing.T) {

	expected1 := "18409"
	expected2 := "19582"

	path, _ := filepath.Abs(filepath.Dir(os.Args[0]) + "/tests/sample2.txt")
	file, _ := os.Open(path)
	defer file.Close()
	scanner := bufio.NewScanner(file)
	scanner.Split(bufio.ScanWords)

	actual1, actual2 := process(scanner)
	if actual1 != expected1 {
		t.Errorf("Test failed, expected: '%s', got:  '%s'", expected1, actual1)
	}
	if actual2 != expected2 {
		t.Errorf("Test failed, expected: '%s', got:  '%s'", expected2, actual2)
	}
}

func TestAlg2(t *testing.T) {

	expected1 := "1"
	expected2 := "1"

	path, _ := filepath.Abs(filepath.Dir(os.Args[0]) + "/tests/sample1.txt")
	file, _ := os.Open(path)
	defer file.Close()
	scanner := bufio.NewScanner(file)
	scanner.Split(bufio.ScanWords)

	actual1, actual2 := process(scanner)
	if actual1 != expected1 {
		t.Errorf("Test failed, expected: '%s', got:  '%s'", expected1, actual1)
	}
	if actual2 != expected2 {
		t.Errorf("Test failed, expected: '%s', got:  '%s'", expected2, actual2)
	}
}
