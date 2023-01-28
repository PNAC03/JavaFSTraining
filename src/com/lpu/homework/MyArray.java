package com.lpu.homework;

public class MyArray
{
		int[] arr;
		int index=0;
		
		public MyArray() {
			arr= new int[5];
		}
		
		public void insert(int element) throws ArrayOutOfBoundExc
		{
			
			if(index>=arr.length) 
				throw new ArrayOutOfBoundExc();
			arr[index] = element;
			index++;
		}
		public int get(int index) throws ArrayOutOfBoundExc
		{
			if(index>=arr.length)
				throw new ArrayOutOfBoundExc();
			return arr[index];
		}
		
}
