package com.lpu.client2;

import com.lpu.lambda.*;

public class lambdaClient {
	
	StringManip str = (a,b)-> {
		return a.substring(0,b);
	};
	
	StringManip str2 = (a,b)->a+b;
	StringManip str3 = (a,b)->
	
	str2 = (a,b)->a.toUpperCase()+b;
	
	String lambdaUse(StringManip sm, boolean flag) {
		return flag + sm.apply("hello", 34);
	}
	
	public static void main(String[] args) {
	String s = str.apply("abcdef", 5);
	System.out.println(s);
	
	lambdaClient lc = new lambdaClient();
	String s2 = lc.lambdaUse(str3, false);
	System.out.println(s2);
	}
}
