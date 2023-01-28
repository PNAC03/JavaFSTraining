package com.lpu.homework;

import com.lpu.shape.CircleBasic;
import java.util.*;


public class listnset {
	
	CircleBasic c1 = new CircleBasic();
	CircleBasic c3 = new CircleBasic();
	
	void operatelist(){
		ArrayList<CircleBasic> clist = new ArrayList<>();
		clist.add(c1);
		clist.add(new CircleBasic());
		clist.add(c3);
		
		for(CircleBasic i:clist) {
			System.out.println("List: " + i.getRadius() + " " + i.getName()); //default radius and name
		}
	}
	
	void operateSet() {
		HashSet<CircleBasic> hs = new HashSet<>();
		hs.add(c1);
		hs.add(new CircleBasic(1, "NewCircle"));
		hs.add(c3);
		
		for(CircleBasic i:hs) {
			System.out.println("Set: " + i.getRadius() + " " + i.getName());
		}
	}
	
	
	
	public static void main(String[] args){
		listnset obj = new listnset();
		obj.operatelist();
		obj.operateSet();
	}
}
