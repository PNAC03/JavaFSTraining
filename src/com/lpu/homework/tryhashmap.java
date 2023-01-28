package com.lpu.homework;

import java.util.*;

public class tryhashmap {
	private int[] arr = {1,2,1,3,2,1};
	private int value=1;
	HashMap<Integer, Integer> repeats = new HashMap<>();
	public void makemap() {
		for(int i:arr) {
			if(repeats.containsKey(i)){
				value=repeats.get(i);			
				repeats.replace(i,value,++value);
			}else {
				repeats.put(i, 1);
			}
		}
	}
	
	public void displaymap() {
		for(int a=0; a<arr.length; a++) {
			System.out.println(arr[a]+ " " + repeats.get(arr[a]));
		}
	}
	
	public static void main(String[] args) {
		tryhashmap obj = new tryhashmap();
		obj.makemap();
		obj.displaymap();
	}
}
