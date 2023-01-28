package com.lpu.shape;

import java.util.Scanner;

//public class ReverseString {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		char[] charac = s.toCharArray();
//		while(s.hasNext()) {
//		for(int i=charac.length-1; i>=0; --i) {
//			System.out.print(charac[i]);
//		}}
//	}


public class ReverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String reverse = reveachword(str);
		System.out.println(reverse);
	}
	
	
	public static String reveachword(String str)
	{
		 // reversing a string
		// This is a string--------  convert the string to string array
		// each time you encounter a space... one word is completed
		
		// int[] arr= new int[];
		String [] arr= str.split(" ");
		String string="";
		for( int i=0;i<arr.length;i++)
		{
			 String word= arr[i];// every index has a seperate word
			 // this word is what we have to reverse 
			 String ans="";
			 for( int j=word.length()-1;j>=0;j--)
			 {
				 ans=ans+word.charAt(j);
				 
			 }
			 // once we come out .....
			 string=string +ans+" ";
			 
		}
		return string;
	}
	
}