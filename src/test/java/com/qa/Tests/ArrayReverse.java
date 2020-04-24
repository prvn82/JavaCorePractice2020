package com.qa.Tests;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] testarrayt = {3,4,5,6,7,3,4};
		reverse(testarrayt);

	}
	
	
	private static void reverse(int[] array) {
		int[] reverseArray = new int[array.length];
		
		int counter=0;
		
		for(int i = array.length-1;i>=0;i--) {
			
				reverseArray[counter]=array[i];
				counter++;
				
			
		}
		
		System.out.println("Array Before revsers "+Arrays.toString(array));
		
		System.out.println("Arrays After reverse "+Arrays.toString(reverseArray));
	}

}
