package week2.day4;

public class Factorial {

	public static void main(String[] args) {
		// input :  num=6
		// output  :120
		int num = 6;
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			// System.out.println(i);

			fact = fact * i;
			// fact ==1*5=5
			// fact=5*4=20
			// fact=20*3=60
			// fact=60*2=120
			// fact=120*1=120
		}
		System.out.println("The Factorial number of " + num + " is : " + fact);

	}

}
