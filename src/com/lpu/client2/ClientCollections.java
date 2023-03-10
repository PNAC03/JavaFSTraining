package com.lpu.client2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

import com.lpu.shape.Shape;
import com.lpu.domain.Employee;
import com.lpu.domain.Department;
import com.lpu.shape.CircleBasic;

/* Collections are datastructures provided to you by
 * as Classes by Java to store arbitrary number of 
 * objects.
 * There are so many because they are read write, sorting 
 * and getting the data.
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Collection.html
 * Interface Collection<E>
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Map.html
 * Interface Map<K,V>
 */
public class ClientCollections {
	

	public static void main(String[] args) {
	
		
	List<Employee> empList = new ArrayList<Employee>();
	Employee emp1 = new Employee("Emp1",1,10);
	Employee emp2 = new Employee("Emp2",2,20);
	Employee emp3 = new Employee("Emp3",3,30);
	Employee emp4 = new Employee("Emp4",4,30);
	
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	empList.add(emp4);
	
	double avgsal,sum = 0;
	
	for(int i =0; i<empList.size();++i ) {
		System.out.println(empList.get(i).getName());
		sum = sum + empList.get(i).getSalary();
	}
	 avgsal = sum/empList.size();
	 System.out.println(avgsal);
	
	 Collection<Employee> coll = empList;
	 
	 Iterator<Employee> itr = coll.iterator();
	
	 while( itr.hasNext()) {
		System.out.println(itr.next().getName());
		
	}
	 // empList.remove(emp1);
	System.out.println(coll.size());
	
	Set<Employee> setEmp = new HashSet<Employee>();
	setEmp.addAll(empList);
	setEmp.add(new Employee("Emp6", 5, 50));
	
	setEmp.addAll(empList);
	
	System.out.println(setEmp.size());
	
	for(Employee e:setEmp) {
		System.out.println(e.getEmpId()+" "+e.getName());
	}
	
	ArrayList<CircleBasic> Clist = new ArrayList<CircleBasic>();
	CircleBasic c1 = new CircleBasic(5,"Circle1");
	CircleBasic c2 = new CircleBasic(10,"Circle2");
	CircleBasic c3 = new CircleBasic(5,"Circle1");
	CircleBasic c4 = new CircleBasic(20,"Circle4");

	Clist.add(c1);
	Clist.add(c2);
	Clist.add(new CircleBasic(12,"Circle5"));
	Clist.add(c3);
	Clist.add(c4);
	
	for(CircleBasic a:Clist) {
		System.out.println(a.getRadius() + " " + a.getName());
	}
	
	Set<CircleBasic> setCir = new HashSet<CircleBasic>();
	setCir.add(c4);
	setCir.addAll(Clist);
	System.out.println(setCir.size());
	
	for(CircleBasic i:setCir) {
		System.out.println(i.getRadius() + " " + i.getName());
	}
	
	
	Map<Employee, Department> mp = new HashMap<Employee, Department>();
	Department hr = new Department("HR");
	Department IT = new Department("IT");
	
	mp.put(emp1,hr);
	mp.put(emp2,hr);
	mp.put(emp3,IT);
	mp.put(emp4,IT);
	
	System.out.println(mp.get(emp3).getName());
	System.out.println(mp.get(emp2).getName());
	
	Set<Entry<Employee, Department>> setOfpairs = mp.entrySet();
	
	for(Entry<Employee,Department> pair:setOfpairs) {
//	System.out.println(setOfpairs.size());
	System.out.println(pair.getKey().getEmpId());
	System.out.println(pair.getValue().getName());
	}
	
	Set<Employee> empKeySet = mp.keySet();
	for(Employee e:empKeySet) {
		System.out.println(e.getEmpId() + " " + e.getName());
	}
	
	mp.values();
	
	Collection<Department> dlist = mp.values();
	
	for(Department i:dlist) {
		System.out.println(i.getName());
	}
	}

	
}