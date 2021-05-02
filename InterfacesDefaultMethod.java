interface Polygon{
	int getArea();
	
	// Default method with implementation
	public default int getSides() {
		return 0;
	}
}

class Rectangle implements Polygon{

	@Override
	public int getArea() {
		return 0;
	}
	
}

public class InterfacesDefaultMethod {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		
		System.out.printf("Area: %d\n", rect.getArea());
		System.out.printf("Sides: %d\n", rect.getSides());
		
	}

}
