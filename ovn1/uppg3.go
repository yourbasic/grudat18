// Nisse Nilsson, grudat18 uppg 1.3

// This package implements a stack of strings.
package main

import "fmt"

// The zero value for Stack is an empty stack ready to use.
type Stack struct {
	data []string
}

// Push adds x to the top of the stack.
func (s *Stack) Push(x string) {
	s.data = append(s.data, x)
}

// Pop removes and returns the top element of the stack.
// It’s a run-time error to call Pop on an empty stack.
func (s *Stack) Pop() string {
	n := len(s.data) - 1
	res := s.data[n]
	s.data[n] = "" // to avoid memory leak
	s.data = s.data[:n]
	return res
}

// Size returns the number of elements in the stack.
func (s *Stack) Size() int {
	return len(s.data)
}

// Unit test
func main() {
	var s Stack
	s.Push("world!")
	s.Push("Hello, ")
	if size := s.Size(); size != 2 {
		fmt.Println("got", size, "expected", 2)
	}

	res := ""
	exp := "Hello, world!"
	for s.Size() > 0 {
		res += s.Pop()
	}
	if res != exp {
		fmt.Println("got", res, "expected", exp)
	}
}

