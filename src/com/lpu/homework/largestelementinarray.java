package com.lpu.homework;
import java.util.*;

public class largestelementinarray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = {};
	int size = sc.nextInt();
	for(int i=0; i<size; i++) {
		arr[i] = sc.nextInt();
	}
	int max=0;
	for(int i=0; i<arr.length; i++) {
		if(i==0) max = arr[i];
		if(arr[i]>max) {max = arr[i];}
		else continue;
	}
	System.out.println(max);
	}
}
