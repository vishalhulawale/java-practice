
public class StringFormat {

	public static void main(String[] args) {

		String city = "Pune";
		int temperature = 1;
		float humidity = 22.22f;
		double doubleNum = 26.55;

		String message = String.format(
				"Weather in %s city. Temperature will be %d celcius. Humidity will be %f. Speed of wind will be %f.",
				city, temperature, humidity, doubleNum);

		System.out.println(message);

	}

}
