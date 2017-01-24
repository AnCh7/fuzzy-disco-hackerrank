package main

import "testing"

func TestAlg(t *testing.T) {
	input1 := "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5"
	input2 := "abc"
	expected := "9"
	actual := process(input1, input2)
	if actual != expected {
		t.Errorf("Test failed, expected: '%s', got:  '%s'", expected, actual)
	}
}

func TestAlg2(t *testing.T) {
	input1 := "6 3 4 4 6 4 5 3 4 3 6 5 4 6 7 1 3 4 2 5 6 1 5 1 7 2"
	input2 := "nrdyluacvr"
	expected := "70"
	actual := process(input1, input2)
	if actual != expected {
		t.Errorf("Test failed, expected: '%s', got:  '%s'", expected, actual)
	}
}
