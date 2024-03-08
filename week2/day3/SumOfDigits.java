package week2.day3;

public class SumOfDigits {

	public static void main(String[] args) {

		// given input number is 324
		// output=9

		// initialization
		int num = 324;
		int reminder;
		int sum = 0;
		int tmp = num;

		while (num > 0) {
			// 
			reminder = num % 10;// 324%10==4 //32 %10==2 3%2=3
			
			sum = sum + reminder;// 4 +2 +3
			num = num / 10;// 32,3

		}

		
		System.out.println("Sum of Digits is :" + sum);

		// int reminder; int num; int sum;
		// reminder=324%10==4
		// sum=4+2+3
		// num=324/10==32,

	}

}
