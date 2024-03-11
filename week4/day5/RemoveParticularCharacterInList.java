package week4.day5;

import java.util.ArrayList;
import java.util.List;

public class RemoveParticularCharacterInList {
public static void main(String[] args) {
	char[] values= {'a','b','c','d','e'};
	
	
	List<Character> remove_C_Character=new ArrayList<Character>();
	
	
	for (int i = 0; i < values.length; i++) {
		remove_C_Character.add(values[i]);
	}
	System.out.println(remove_C_Character);
	
	remove_C_Character.remove(3);
	System.out.println(remove_C_Character);
	
	     //datatype //local variable name :Iterate vales from object
	for (Character character : remove_C_Character) {
		System.out.println(character);
		
	}
	
	
}
}
