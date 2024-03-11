package week4.day5;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	//Initialize List
	List<String> names=new  ArrayList<String>();
	
	//add the values in list
	names.add("Afzar");
	names.add("Hari");
	names.add("Deepan");
	names.add("Guru");
	names.add("Sakthi");
	//To get length of list
	System.out.println(names.size());
	//Print the list
	System.out.println(names);
	
	//to remove particular element in a list
	names.remove(0);
	System.out.println(names);
	names.add(0, "Kalvin");
	System.out.println(names);
	
	//To delete the list
	//names.clear();
	System.out.println(names);
	System.out.println(names.size());
	
	//To check if list is empty or not
	boolean empty = names.isEmpty();
	System.out.println(empty);
	
	//To get particular values from list
	String string = names.get(1);
	System.out.println(string);
	
	//To check If the existing values present in a list
	boolean contains = names.contains("guru");
	System.out.println(contains);
	
	
	
	
}
}
