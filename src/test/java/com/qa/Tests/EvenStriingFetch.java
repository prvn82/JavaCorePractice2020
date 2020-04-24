package com.qa.Tests;

import java.util.Arrays;

public class EvenStriingFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  GivenString = "This is cat which were smiling in the Skies";
		printEvenString(GivenString);
		String grt = " ";
		System.out.println(isWhiteSpacePresent(grt));

	}
	
	
	private static void printEvenString(String str) {
		String[] split = str.split(" ");
		
		for(String s : split) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}
	}
	
	
	private static boolean isWhiteSpacePresent(String str) {
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));
		
		if(split.length!=0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
