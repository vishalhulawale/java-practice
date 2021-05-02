
public class VarArgs {

	static int add(int... nums) {
		int sum = 0;

		for (int num : nums) {
			sum += num;
		}

		return sum;
	}

	public static void main(String[] args) {

		int sum1 = add(1);
		System.out.println(sum1);

		int sum2 = add(1, 2);
		System.out.println(sum2);

		int sum3 = add(1, 3, 4);
		System.out.println(sum3);

	}

}
