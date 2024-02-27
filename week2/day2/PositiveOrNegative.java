package week2.day3;

public class PositiveOrNegative {

	int num1 = 20;
	int num2 = -34;

	public void positiveOrNegative1() {
		if (num1 > 0) {
			System.out.println("the Given number is positive");
		} else {
			System.out.println("The Given Number is negative");
		}

	}

	public void positiveOrNegative2() {

		if (num2 > 0) {
			System.out.println("the Given number is positive");
		} else {
			System.out.println("The Given Number is negative");
		}

	}


	
	
	// int num1 =20;

	// int num2 = -34;

	// output:
	// num1 is Positive Number
	// num2 is Negative Number

public static void main(String[] args) {
	
	PositiveOrNegative pn=new PositiveOrNegative();
	
	pn.positiveOrNegative1();
	pn.positiveOrNegative2();
	
}	
	
}
