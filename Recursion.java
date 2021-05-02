public class Recursion {

	public static void main(String[] args) {

		int factorial = getFactorial(4000);

		System.out.println(factorial);

	}

	private static int getFactorial(int n) {

		if (n == 0)
			return 1;

		return n * getFactorial(n - 1);

	}

}
