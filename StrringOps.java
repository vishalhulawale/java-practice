
public class StrringOps {

	public static void main(String[] args) {
		String str1 = "test1";
		String str2 = "test2";
		
		// Join strings
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		String str4 = "abc@cdf@ghi";
		
		// Split & Join
		String[] strArr = str4.split("@");
		String joinedStr = String.join("*", strArr);
		System.out.println(joinedStr);
		
		// Compare
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("test1"));
		
	}

}
