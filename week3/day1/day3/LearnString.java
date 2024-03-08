package week3.day3;

public class LearnString {
	public static void main(String[] args) {

		// String Literal

		String name = "Testleaf";

		String name1 = "BI   LAL";
		String name2 = "bilal";
		// String Instance

		String insta = new String("Testleaf");

		if (name == insta) {// check the memory address

			System.out.println(" Equal");
		}

		if (name.equals(insta)) {// check the memory address

			System.out.println(name);
		}

		if (name1.equalsIgnoreCase(name2)) {

			System.out.println(name1);
		}

		int length = name1.length();
		System.out.println(length);

		char[] charArray = name.toCharArray();
		char c = charArray[0];

		String upperCase = name.toUpperCase();

		System.out.println(upperCase);
		
		boolean contains = name.contains("fae");
		System.out.println(contains);
		
		
		char charAt = name.charAt(1);
		
		
	}
}
