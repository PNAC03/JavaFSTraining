package com.lpu.shape;

import com.lpu.homework.ArrayOutOfBoundExc;
import com.lpu.homework.MyArray;

public class MyArrayUse {
	public static void main(String[] args) {
		try {
		MyArray a1 = new MyArray();
		a1.insert(78);
		a1.insert(55);
		a1.insert(89);
		a1.insert(03);
		a1.insert(95);
		System.out.println(a1.get(2));
		System.out.println(a1.get(1));
		System.out.println(a1.get(4));
		a1.insert(100);
		}
		catch(ArrayOutOfBoundExc ex){
			ex.printStackTrace();
		}
	}

}
