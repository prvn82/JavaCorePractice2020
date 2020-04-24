package com.qa.Tests;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
	
	
	List<String> items = new ArrayList<String>();
	
	
	
	private void getGroceryItems(String item) {
		items.add(item);
	}
	
	
	private void printGroceryItems() {
		System.out.println("You have total "+items.size()+ " items in your list");
		for(int i=0;i<items.size();i++) {
			System.out.println((i+1)+ items.get(i));
		}
	}
	
	private void modifyGroceryList(String OldItem,String newItem) {
		items.set(items.indexOf(OldItem), newItem);
		System.out.println(OldItem+ " Has been replaced by "+newItem);
	}
	
	private void removeGrocryItems(String Item) {
	    items.remove(items.indexOf(Item));
		System.out.println(Item+ " is removed. ");
	}
	

}
