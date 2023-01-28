package com.lpu.homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
	List <Integer> list = Arrays.asList(1,3,4,6,5,7,16,20,24);

	
	public static void main(String[] args) {
		StreamDemo obj = new StreamDemo();
//		obj.StreamTrial();
//		obj.streamcount();
//		obj.consumerintf();
		obj.filter();
	}
	
	public void StreamTrial() {
	// int count = 0;
	// if I want to iterate
	// for loop // enhances forloop
	// iterator
	// external iterations
	// internal iterations
	// these can be performed with the help of streams
	//When do we use stream??
	// under those circumstances where we want to perform some operations but we do not want to manipulate the original data
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
//	System.out.println("---" + count);
	Stream<Integer> data = list.stream();
	//data
	//Streams provide us implementation of so many methods to perform operations
	data.forEach(i->System.out.println(i));
	
	}
	
	
	public void streamcount() {
		List<Integer> list = Arrays.asList(1,3,4,6,5,7);
		Stream<Integer> data=list.stream();
		long count = data.count();
		System.out.println("---" + count);
	}
	
	public void consumerintf(){
		//using Anonymous class
//		Consumer<Integer> c = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
		
		//using lambda exp
//		Consumer<Integer> c = (Integer i) -> 
//			{System.out.println(i);};
//		Stream<Integer> values = list.stream();
//		values.forEach(c);		
	}
	
	public void filter(){
		Predicate<Integer> predi = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		Predicate<Integer> predi5 = t -> t%5==0;

		Stream<Integer> values = list.stream();
		values.filter(predi).forEach(i->System.out.println(i));
		
		Stream<Integer> newval = list.stream();
		long cc = newval.count();
		System.out.println(cc);
		
		Stream<Integer> valuenew = list.stream();
		valuenew.filter(predi5).forEach(i->System.out.println(i));
		
		System.out.println();
		
		Stream<Integer> valuenew2 = list.stream();
		valuenew2.map(n->5*n).filter(predi5).forEach(i->System.out.println(i));
//		Stream<Integer> filteredElements = values.filter(t->t%2==0);
//		filteredElements.forEach(i->System.out.println(i));
//		values.forEach(c);
//		data.forEach(i->System.out.println(i));
		
		
	}
	
	
	
	
}


