package main

import "testing"

func TestMiniMaxSum(t *testing.T) {
	input := "1 2 3 4 5"
	expected := "10 14"
	actual := process(input)
	if actual != expected {
		t.Errorf("Test failed, expected: '%s', got:  '%s'", expected, actual)
	}
}
