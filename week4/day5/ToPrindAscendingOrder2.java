package week4.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToPrindAscendingOrder2 {
public static void main(String[] args) {
	int[] num= {100, 10, 50, 200, 20};
	
	List<Integer> number=new ArrayList<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		number.add(num[i]);
	}
	
	System.out.println(number);
	Collections.sort(number);
	System.out.println(number);
	Collections.reverse(number);
	System.out.println(number);
}
}
