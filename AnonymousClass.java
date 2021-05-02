class Human {

	public void eat() {

		System.out.println("I'm vegetarian!!");

	}

}

interface Engineer {
	public void work();
}

public class AnonymousClass {

	public static void createClass() {

		// Defining anonymous class extending class
		Human h1 = new Human() {
			public void eat() {
				System.out.println("I'm non-vegetarian!!");
			}
		};

		h1.eat();

		// Defining anonymous class implementing interface
		Engineer e1 = new Engineer() {
			@Override
			public void work() {
				System.out.println("I'm working!!");
			}
		};

		e1.work();
	}

	public static void main(String[] args) {

		createClass();

	}

}
