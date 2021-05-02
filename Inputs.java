import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String text = in.next();
		System.out.println(text);

		int num = in.nextInt();
		System.out.println(num);

		in.close();
	}

}
