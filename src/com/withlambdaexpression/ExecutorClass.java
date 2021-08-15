package com.withlambdaexpression;

public class ExecutorClass {
	
	public static void main(String[] args) {
		
		
		AddingtwoStrings ad=(s1,s2)->s1+s2;
		
		String returnv=ad.adding2Strings("saii", "yashui");
		System.out.println(returnv);
	}

}
