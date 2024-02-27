package week2.day3;

public class StudentsMark {

	int sanjay = 38;
	int srinivasan = 63;
	int anburaj = 91;
	int sharmika = 100;

	public void sanjayMark() {

		if (sanjay >= 35 && sanjay < 50) {
			System.out.println("Grade C");
		} else if (sanjay >= 50 && sanjay < 90) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade A");

		}
	}

	public void srinivasanMark() {

		if (srinivasan >= 35 && srinivasan < 50) {
			System.out.println("Grade C");
		} else if (srinivasan >= 50 && srinivasan < 90) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade A");

		}
	}

	public void anburajMark() {

		if (anburaj >= 35 && anburaj < 50) {
			System.out.println("Grade C");
		} else if (anburaj >= 50 && anburaj < 90) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade A");

		}
	}

	public void sharmikaMark() {

		if (sharmika >= 35 && sharmika < 50) {
			System.out.println("Grade C");
		} else if (sharmika >= 50 && sharmika < 90) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade A");

		}
	}

	public static void main(String[] args) {
		StudentsMark mark = new StudentsMark();

		mark.sanjayMark();
		mark.srinivasanMark();
		mark.anburajMark();
		mark.sharmikaMark();
	}

}
