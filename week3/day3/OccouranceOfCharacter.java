package week3.day3;

public class OccouranceOfCharacter {

	public static void main(String[] args) {

		String name = "Testleaf";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			if (charAt == 't') {
				count++;

			}

		}
		System.out.println("Character Occourance in " + name + " of t is " + count);

	}

}
