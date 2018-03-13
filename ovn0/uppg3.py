# Nisse Nilsson, grudat18 uppg 0.3

class Stack:
	"""This class implements a stack of objects."""

	def __init__(self):
		"""Construct an empty stack."""
		# _data[] holds the stack items.
		self._data = []

	def push(self, item):
		"""Add x to the top of the stack."""
		self._data += [item]

	def pop(self):
		"""Remove and return the top element of the stack.

		It is a run-time error to call pop on an empty stack.
		"""
		return self._data.pop()

	def __len__(self):
		"""Return the number of elements in the stack."""
		return len(self._data)

# Unit test
def main():
	s = Stack() # stack of strings
	s.push("world!")
	s.push("Hello, ")
	assert len(s) == 2

	res = ""
	exp = "Hello, world!"
	while len(s) > 0:
		res += s.pop()
	assert res == exp

if __name__ == '__main__': main()
