package week2.day1;

public class Calculator {

	int d = 50;

	public int addition() {

		int a = 10;

		int b = 20;

		int c = a + b;
		System.out.println(c + d);

		return c;
	}

	public float sub(int x) {

		int c = d - 10;
		float per = 80.55f;
		System.out.println(c + d + " \n" + c);
		System.out.println(x);

		return per;

	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		float sub = cal.sub(5);

		System.out.println(sub);
		
		PublicAccessModifier pb= new PublicAccessModifier();
		pb.protectedAccessLevel();
		pb.defaultAccessLevel();

	}

}
