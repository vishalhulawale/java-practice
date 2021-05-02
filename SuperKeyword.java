class Vehicle {

	void drive() {
		System.out.println("Vehice is driving!!");
	}

}

class Car extends Vehicle {

	protected void drive() {
		super.drive();
		System.out.println("Car is driving!!");
	}

}

public class SuperKeyword {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.drive();

	}

}
