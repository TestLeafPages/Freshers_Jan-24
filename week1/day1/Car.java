package week1.day1;

public class Car {

	public void soundHorn() {
System.out.println(" Sound Horn");
	}

	public void applyBreak() {
		System.out.println(" Applying break");

	}

	
	
	public void accelarator() {
		
		System.out.println(" Accelarator");


	
	}

	public static void main(String[] args) {
	

//ClassName  objectName= new ClassName();
	
	Car obj=new Car();
	obj.accelarator();
	obj.applyBreak();
	obj.soundHorn();
	
	
	}
	
}
