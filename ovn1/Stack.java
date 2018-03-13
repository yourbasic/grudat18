// Nisse Nilsson, grudat18 uppg 1.3

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * This class implements a stack of Strings.
 */
public class Stack {
	private String[] data;
	private int size; // number of elements in stack
	private static final int START_SIZE = 8; // size of underlying array

	/**
	 * Constructs an empty stack.
	 */
	public Stack() {
		data = new String[START_SIZE];
	}
	
	/**
	 * Adds s to the top of this stack.
	 *
	 * @param s element to be added to this stack
	 */
	public void push(String s) {
		if (size == data.length) {
			data = Arrays.copyOf(data, 2*data.length);
		}
		data[size++] = s;
	}

	/**
	 * Removes and returns the top element of this stack.
	 *
	 * @return the element at the top of this stack
	 * @throws java.util.EmptyStackException if the stack is empty
	 */
	public String pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		String res = data[--size];
		data[size] = null; // to avoid memory leak
		return res;
	}
	
	/**
	 * Returns the number of elements in this stack.
	 *
	 * @return the number of elements in this stack
	 */
	public int size() {
		return size;
	}

	/**
	 * Unit test. Usage: java -ea Stack
	 */
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("world!");
		s.push("Hello, ");
		assert s.size() == 2;

		String res = "";
		String exp = "Hello, world!";
		while (s.size() > 0) {
			res += s.pop();
		}
		assert res.equals(exp);
	}
}

