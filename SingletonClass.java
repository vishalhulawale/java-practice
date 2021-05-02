class Singleton {

	private static Singleton singletonInstance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Singleton();

		return singletonInstance;
	}

}

public class SingletonClass {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1.equals(s2));

	}

}
