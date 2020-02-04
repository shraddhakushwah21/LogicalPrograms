package com.java.logical;
class ReverseStringWithoutChangingSpecialCharsPosition {

	public static void main(String[] args) throws Exception {
		String str="#j$av&a*@";
		System.out.println("Original String :: "+str);
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			//char c=str.charAt(str.length()-1);
			if(!Character.isLetter(ch) && !Character.isLetter(str.charAt(0))) {
				result += ch;
			}else {
				result += str.charAt(i);
			}
		}
		System.out.println("Resultant String :: "+result);
		
	}

}
