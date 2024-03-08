package week2.day4;

public class Palindrom {

	public static void main(String[] args) {

		String name = "malayalam";

		String temp = "";

		char[] charArray = name.toCharArray();
		// 0 1 2 3 4 5 6 7 8
		// m a l a y a l a m

		for (int i = charArray.length - 1; i >= 0; i--) {

			temp = temp + charArray[i];

		}
		if (temp.equals(name)) {
			System.out.println("The Given word  " + name + " is  Paindrome :");
		} else {
			System.out.println("The Given word  " + name + " is  not  Paindrome :");
		}
	}

}
