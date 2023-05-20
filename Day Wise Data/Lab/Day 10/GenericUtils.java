package com.utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//import com.bank.system.T;

public class GenericUtils {
	public static <T> void printCollection(Collection<T> collection) {
		for (T element : collection)
			System.out.println(element);
	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		printCollection(al);

		List<String> al2 = new ArrayList<>();
		al2.add("one");
		al2.add("two");
		printCollection(al2);

		List<Emp> al3 = new ArrayList<>();
		al3.add(new Emp(1, "Jitesh"));
		al3.add(new Emp(1, "Bafna"));
		printCollection(al3);
	}
}

class Emp {

	private int empId;
	private String empName;

	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}

}
