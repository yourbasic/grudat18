# Nisse Nilsson, grudat18 uppg 0.2

def odd(n):
	"""Tell if n is an odd number."""
	return n%2 != 0

# Unit test
assert not odd(-2)
assert odd(-1)
assert not odd(0)
assert odd(1)
assert not odd(2)

