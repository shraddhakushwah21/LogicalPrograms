package com.java.logical;

// Swap the given string based on string length
public class SwapString {

	public static void main(String[] args) {
		String str="Kushwah";
		String result=swapString(str);
		System.out.println(result);

	}

	private static String swapString(String str) {
		String swapStr="";
			if(str.length()%2==0) {
				swapStr += swapStr+str.substring(str.length()/2, str.length())+str.substring(0, str.length()/2);
			}else {
				swapStr += swapStr+str.substring((str.length()/2)+1, str.length())+str.charAt(str.length()/2)+str.substring(0, (str.length()/2));
			}
		return swapStr;
	}

}
