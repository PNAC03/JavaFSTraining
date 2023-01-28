package com.lpu.homework;

public class ArraysIntersection {
	int newsize;
	int arraynew[];
	
	public void compare() {
		int[] arr1 = {1,2,5,6};
		int[] arr2 = {2,5,6,9,12};
		int count=0;
		if(arr1.length>arr2.length) newsize = arr2.length;
		else newsize = arr1.length;
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					createarr(arr1[i],count);
					count++;
//					System.out.print(arr1[i] + " ");
				}
				else continue;
			}
		}
		
		displayarr();
	}
	
	public static void main(String[] args) {
		ArraysIntersection obj = new ArraysIntersection();
		obj.compare();
	}
	
	public void createarr(int element, int count) {
			arraynew[count] = element;
	}
	
	public void displayarr() {
		for(int i = 0; i<arraynew.length; i++) {
			System.out.println(arraynew[i] + " ");
		}
	}
}


/* Proper Code
 	public class ArraysIntersection{
  	public void compare() {
		int[] arr1 = {1,2,5,6};
		int[] arr2 = {2,5,6,9,12};
	
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
				else continue;
			}
		}
		
	}
	
	public static void main(String[] args) {
		ArraysIntersection obj = new ArraysIntersection();
		obj.compare();
	}
	}
*/
