package com.lpu.homework;

import java.util.ArrayList;

public class Student {
	String name;
	int rollNumber;
	
	public Student(String name, int rollNumber)
	{
		this.name = name;
		this.rollNumber= rollNumber;
	}
	
	public static void main(String[] arg) {
		ArrayList<Student> studentsLists = new ArrayList<>();
		Student s1 = new Student("alice", 101);
		studentsLists.add(s1);
		Student s2 = new Student("bob", 102);
		studentsLists.add(s2);
		studentsLists.add(new Student("john", 103));
		
		for(Student iter:studentsLists) {
			System.out.println(iter.name+" "+iter.rollNumber);
		}
		System.out.println();
		for(int i=0;i<studentsLists.size();i++) {
			Student s = studentsLists.get(i);
		}
		
		int[] arr = {10,2,3};
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
}
