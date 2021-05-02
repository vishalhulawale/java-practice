class Bike {
	private String bikeType;

	Bike(String bikeType) {
		this.bikeType = bikeType;
	}

	String getBikeType() {
		return this.bikeType;
	}

	class Engine {

		Engine() {
			this.setEngineType();
		}

		private String engineType;

		public String getEngineType() {
			return engineType;
		}

		private void setEngineType() {
			if (Bike.this.bikeType == "sport")
				engineType = "Bigger";
			else
				engineType = "Smaller";
		}

	}
}

public class NestedClassNonStatic {

	public static void main(String[] args) {

		Bike b1 = new Bike("Sports");
		Bike.Engine engine = b1.new Engine();

		System.out.println(engine.getEngineType());

	}

}
