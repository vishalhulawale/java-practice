
final class FinalClass {

}

//Won't work as final classes can not be extended
//class SubClass extends FinalClass {
//}

class FinalMethodContainer {

	final void finalMethod() {
		
	}
	
}

class FinalMethodContainerSubClass extends FinalMethodContainer {

//Won't work as final methods can not be overridden
//	void finalMethod() {
//		
//	}
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		final int NUM = 10;
		
		//Won't work as final constants can not be re-initialized
		//NUM=100;
		
		System.out.println(NUM);
	}

}
