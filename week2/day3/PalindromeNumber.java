package week2.day3;

public class PalindromeNumber {

	public static void main(String[] args) {
		// input =534
		// output=435
		// initialization
		int num = 535, reminder, sum = 0;
		int tmp = num;
		while (num > 0) {
			reminder = num % 10;// 534%10 = 4
			sum = (sum * 10) + reminder;
			// 1//sum =(0*10)+4==4
			// 2 //sum=(4*10)+3==43
			// 3 // sum=43*10+5==435
			// num=534/10;=53 ,
			num = num / 10;
		}
		if (tmp == sum) {
			System.out.println("The given Number is palindrome");
		}

		else {
			System.out.println("The Given Number is not palindrome");
		}
	}

}
