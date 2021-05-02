class Animal {
	String name;

	protected void eat() {
		System.out.println("I'm eating!!");
	}
}

class Dog extends Animal {
	
	Dog(String name){
		this.name = name;
	}

	public void display() {
		System.out.printf("My name is %s.", this.name);
	}

}

public class Inheritance {

	public static void main(String[] args) {

		Dog d1 = new Dog("Tommy");
		d1.eat();
		d1.display();

	}

}
