package factorial.example;

public class Factorial {

	public int compute(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative input: " + n);
		if (n == 0)
			return 1;
		int result = 1;
		while (n >= 2) {
			result *= n--;
		}
		return result;
	}

}
