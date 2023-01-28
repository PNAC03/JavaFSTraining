package com.lpu.client2;

import java.util.Arrays;
import com.lpu.lambda.*;

public class StreamClient{
	public static void main(String[] args) {
		int [] intArray = {1,4,2,5,6,7,33,22,11,55,8,44};
		
		IntConsumer intCons = (a) -> System.out.print(" "+ a);
		intCons = a -> System.out.print(" " + a);
		
//		Arrays.stream(intArray).forEach(intCons);
		Arrays.stream(intArray).forEach(a-> System.out.print(" "+a));
		
		Arrays.stream(intArray).filter(a -> a%2==0)
							   .map(a->a*a)
							   .mapToObj(a -> new Employee(a))
							   .forEach(a->System.out.println(" " + a));
	}
}
