package week3.day3;

public class ChangeIndexToUpperCase {

	public static void main(String[] args) {
		// Original string
		String name = "Changeme";

		// String to store the modified characters
		String upper = "";

		// Convert the original string to a character array
		char[] charArray = name.toCharArray();

		// Iterate through each character in the array
		for (int i = 0; i < charArray.length; i++) {
			// Get the current character
			char a = charArray[i];

			// Check if the index is even
			if (i % 2 == 0) {
				
				
				// If even, convert the character to uppercase and append to the result string
				upper = upper + Character.toUpperCase(a);
			} else {
				// If odd, append the character as it is to the result string
				upper = upper + charArray[i];
			}
		}
	}

}
