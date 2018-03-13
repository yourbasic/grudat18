// Nisse Nilsson, grudat18 uppg 1.2
public class Uppg2 {
	/**
	 * Tells if n is an odd number.
	 */
	public static boolean isOdd(int n) {
		return n%2 != 0;
	}

	/**
	 * Unit test. Usage: java -ea Uppg2
	 */
	public static void main(String[] args) {
		assert !isOdd(-2);
		assert isOdd(-1);
		assert !isOdd(0);
		assert isOdd(1);
		assert !isOdd(2);
	}
}
