package week3.day1;

public class LearnArray {

	public static void main(String[] args) {

		// dataType [] variableName = {10,24,26,46,475,455}

		// dataType [] variableName = {"testleaf","Qeagle"}

//		int num1=33;
//		
		int [] num  = {10,24,26,46,475,455};
//		
//		
//		int length = num.length;
//		
//		System.out.println(length);
//		
//		
//		System.out.println(num1);
//		
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
//		System.out.println(num[5]);
//		
//		System.out.println(num);
//		
//		
//		
	for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
//		
		// dataType [] variableName = new dataType[range];

	int [] numbers= new int[6];
	
	
		String[] names = new String[5];

		names[0] = "Bilal"; //1
		names[1] = "Kesav"; //2
		names[2] = "Anburaj";//3

		names[3] = "Manikandan";//4
		names[4] = "Arish"; //5

		System.out.println(names[0]);

	}
}
