package com.qa.Tests;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str1 = "Prav";
		String Str2 = "Prav";
		Str2="naven";
		
		System.out.println(Str1);
		System.out.println(Str2);
		System.out.println(Str1);
		
		char[] a = {'A','d','k','s'};
		String j = new String(a);
		System.out.println(a);

	}
	
	
	private static boolean CompareString(String Str1, String Str2) {
		return Str1.equals(Str2);
	}

}
