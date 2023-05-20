package com.app.fruits;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTester {
	
	public static void main(String[] args) {
		HashMap<Emp,Emp> map = new HashMap<Emp,Emp>();
		Emp e1 = new Emp(0, "Jitesh");
		Emp e2 = new Emp(23, "Bafna");
		Emp e3 = new Emp(15, "Jitesh Bafna");
		map.put(e1, e1);
		map.put(e2, e2);
		map.put(e3, e3);
		System.out.println(map);
		
		TreeMap<Emp,Emp> tMap = new TreeMap<Emp,Emp>(map);
		System.out.println(tMap);
	}

}

class Emp implements Comparable<Emp> {

	private Integer empId;
	private String name;

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + "]";
	}

	public Emp(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Emp o) {
		Emp e = (Emp) o;
		return e.getEmpId().compareTo(this.getEmpId());
	}

}
