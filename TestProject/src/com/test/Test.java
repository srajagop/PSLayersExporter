package com.test;

import java.util.ArrayList;

import com.util.Utils;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello world develop");
		String str = "Something big";
		System.out.println("str: "+ str);		
		
		ArrayList<String> lst = Utils.splitString(str);
		Utils.printList(lst);
	}
}
