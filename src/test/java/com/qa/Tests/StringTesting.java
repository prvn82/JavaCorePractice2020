package com.qa.Tests;

public class StringTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program:Given a string str of some specific length, 
		//the task is to pad this string with the 
		//given character ch, inorder to make the string of length L.
		
		
		System.out.println(RightPadding("Geeksforgeeks","-",20));

		
		
	}
	
	private static String LeftPadding(String Str , String padding, int StrLength) {
		if(Str.length()>StrLength) {
			return Str;
		}
		else {
			for(int i=0;i<(StrLength-Str.length());i++) {
				
				Str = padding+Str;
				
				
			}
			
			return Str;
		}
	}
	
	
	private static String RightPadding(String Str , String padding, int StrLength) {
		if(Str.length()>StrLength) {
			return Str;
		}
		else {
			for(int i=0;i<(StrLength-Str.length());i++) {
				
				Str = Str+padding;
				
				
			}
			
			return Str;
		}
	}

}
