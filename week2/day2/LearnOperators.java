package week2.day3;

public class LearnOperators {

	public static void main(String[] args) {

		int age = 18;

		int num = 5;

		// ==

		if (num == 7) {
			System.out.println("Number is ==5 ");
		}

		else {
			System.out.println("Number is !=5 ");
		}

		if (num != 5) {
			System.out.println("Given Number is  Satisfied ");
		}

		else {
			System.out.println("Given Number is not Satisfied ");
		}

		if (age >= 18) {
			//18>19
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not Eligible");

		}

		//System.out.println(age+num);
		System.out.println(++age);
		//System.out.println(age++);
		System.out.println(--age);
		System.out.println(age--);
	}

}
