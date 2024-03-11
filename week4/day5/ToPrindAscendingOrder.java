package week4.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToPrindAscendingOrder {
public static void main(String[] args) {
	
	List<Integer> number=new ArrayList<Integer>();
	number.add(100);
	number.add(10);
	number.add(50);
	number.add(200);
	number.add(20);
	
	System.out.println(number);
	Collections.sort(number);
	System.out.println(number);
	Collections.reverse(number);
	System.out.println(number);
}
}
