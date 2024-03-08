package week3.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
 int num[]= {8,7,1,2,4,5,6,3};
 Arrays.sort(num);
 //1 2 3 4 5 6 7 8
 
 
 int length =num.length;
 
 
 System.out.println("Second Largest "+num[length-2]);
		
//second Smallest
 
 System.out.println("Second Smallest "+num[1]);		
		
		
	}

}
