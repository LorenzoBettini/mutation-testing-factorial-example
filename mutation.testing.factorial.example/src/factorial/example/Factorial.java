package factorial.example;

import java.util.stream.IntStream;

public class Factorial {

	public int compute(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative input: " + n);
		return IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
	}

}
