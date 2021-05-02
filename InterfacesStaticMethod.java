interface InterfaceWithStaticMethod {

	static void sayHello() {

		testPrivateMethod();
		System.out.println("Hello");

	}
	
	private static void testPrivateMethod() {

		System.out.println("This is private method.");
		
	}

}

public class InterfacesStaticMethod {

	public static void main(String[] args) {

		InterfaceWithStaticMethod.sayHello();
		
	}

}
