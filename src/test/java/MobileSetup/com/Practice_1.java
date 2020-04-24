package MobileSetup.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice_1 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a java program to find the duplicate words and their number of occurrences in a string?

     
		
		String Str = "My MY Name is Praveen";
		
		List<String> check = new LinkedList<String>();
		
		for(int i=0;i<Str.length();i++) {
			
		
			
			if(check.contains(Character.toString(Str.charAt(i)))) {
				continue;
			}
			else {
			int count =1;
			for(int j =i+1;j<Str.length();j++) {
				//System.out.println(Str.charAt(i) + " "+ Str.charAt(j));
				if(Str.charAt(i)==Str.charAt(j)) {
					count++;
				}
			}
			
			if(count>1) {
				check.add(Character.toString(Str.charAt(i)));
				System.out.println(Str.charAt(i)+ " Has total number of "+count+ " elements in string");
			}
			}
		}

	}

}
