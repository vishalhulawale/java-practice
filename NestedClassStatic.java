class MotherBoard {

	static class USB {
		int ports = 101;
	}

}

public class NestedClassStatic {

	public static void main(String[] args) {

		MotherBoard.USB usb1 = new MotherBoard.USB();

		System.out.println(usb1.ports);

	}

}
