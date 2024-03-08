package week2.day4;

public class FibonacciSeries {
//0 1 2 3 4 5 
// num 3= 0 1  1 2  3  5  8 13  

	public static void main(String[] args) {

		int num1 = 0, num2 = 1, num3;
		// printing first number & Second Number
		System.out.println(num1 + "\n" + num2);

		for (int i = 2; i <= 6; i++) {

			num3 = num1 + num2;// 3rd number
			// num3= 0 + 1 =1
			// 1 + 1 =2
			// 1 + 2 =3
			// 2 + 3 =5
			// 3 + 5 =8

			System.out.println(num3);

			num1 = num2;
			num2 = num3;

		}

	}

}
