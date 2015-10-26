package com.util;

import java.util.ArrayList;
import java.util.List;

public final class Utils {
	public static String name = "something";
	
	public static ArrayList<String> splitString(String str) {
		ArrayList<String> myList = new ArrayList<String>();
		for (String st : str.split("")){
			myList.add(st);
		}		
		return myList;	
	}
	
	public static void printList(ArrayList<String> str) {
		for (String st : str){
			System.out.println("STR LIST: "+ st);
		}			
	}
	
}
