class Parent {
	void display() {
		System.out.println("Displaying Parent");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("Displaying Child");
	}
}


public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException {

		// Create Object by name
		Class<?> c1 = Class.forName("Developer");
				
		System.out.println(c1.getName());
		
		
	}

}
