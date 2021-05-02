enum SIZE {
	SMALL(10), MEDIUM(20), LARGE(25);

	private final int price;

	private SIZE(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	String getSize() {
		switch (this) {
		case SMALL:
			return "SMALL";
		case MEDIUM:
			return "MEDIUM";
		case LARGE:
			return "LARGE";
		default:
			return null;
		}
	}
}

public class EnumClass {

	public static void main(String[] args) {
		SIZE pizzaSize = SIZE.SMALL;
		System.err.println(pizzaSize.getPrice());

		// Get ordinal
		for(SIZE size: SIZE.values()) {
			System.out.println(size.getPrice());
			System.out.println(size.ordinal());
		}
		
		// Get enum constant from string
		SIZE small = SIZE.valueOf("SMALL");
		System.out.println(small.equals(SIZE.SMALL));
	}

}
