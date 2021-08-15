package com.withoutlambdaexpression;

public class ExecutorClass {
	
	public static void main(String[] args) {
		AddingtwoStrings ad= new AddTwoStringimpl();

		String returnvalue=ad.adding2Strings("sai", "yashui");
		System.out.println(returnvalue);
		
		
		//AddingtwoStrings adI= (s1,s2)-> s1+s2;;

}
}
