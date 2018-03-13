// Nisse Nilsson, grudat18 uppg 1.2

package main

import "fmt"

// Odd tells if n is an odd number.
func Odd(n int) bool {
	return n%2 != 0
}

// Unit test.
func main() {
	var tests = []struct {
		n   int
		exp bool
	}{
		{-2, false},
		{-1, true},
		{0, false},
		{1, true},
		{2, false},
	}
	for _, e := range tests {
		res := Odd(e.n)
		if res != e.exp {
			fmt.Printf("Odd(%d) = %v, expected %v",
				e.n, res, e.exp)
		}
	}
}
