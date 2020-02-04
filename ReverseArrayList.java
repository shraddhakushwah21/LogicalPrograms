package com.java.logical;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Shraddha");
		list.add("Sonam");
		list.add("ANkit");
		list.add("ANshu");
		list.add("Ankur");
		System.out.println("Original List ::"+list);
		
		List<String> reverseList=reverseArrayList(list);
		System.out.print("Resultant List :: "+reverseList);

	}

	private static List<String> reverseArrayList(ArrayList<String> list) {
		List<String> result=new ArrayList<String>();
		for(int i=list.size()-1;i>=0;i--) {
			result.add(list.get(i));
		}
		return result;
	}

}
