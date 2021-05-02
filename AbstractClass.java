abstract class Person {

	abstract void work();

}

class AbstractionProvider extends Person {

	@Override
	void work() {

		System.out.println("Work started!!");

	}

}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionProvider abs = new AbstractionProvider();
		abs.work();

	}

}
