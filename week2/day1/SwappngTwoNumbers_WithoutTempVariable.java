package week2.day1;

public class SwappngTwoNumbers_WithoutTempVariable {

	public static void main(String[] args) {

		int a = 50;
		int b = 100;

		// b=b-a// 100-50 b=50
		// a=a+b//50+50;
		b = b - a;// b=50;
		a = b + a;// a=100;
		System.out.println("The Value of A is :" + a);
		System.out.println("The value of B is : " + b);

//		int a = 20;
//		int b = 80;
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println("The Value of A is :" + a);
//		System.out.println("The value of B is : " + b);

	}

}
