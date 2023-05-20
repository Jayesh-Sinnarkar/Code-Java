package al;

import java.util.ArrayList;
import java.util.List;

public class TesterAL {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();
		
		//populate list
		emps.add(new Employee("f1","e1"));
		emps.add(new Employee("f2","e2"));
		emps.add(new Employee("f3","e3"));
		emps.add(new Employee("f4","e4"));
		emps.add(new Employee("f5","e5"));
		
		//display
		System.out.println(emps);
		
		//search
		String employeeId = "e5"; //user
		boolean found = false;
		for(Employee e: emps) {
			if(e.getEmployeeId().equals(employeeId)){
				System.out.println("found");
				System.out.println(e);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("not found");
		}
		
		//search
		int index = emps.indexOf(new Employee(employeeId));
		if(index==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found");
			System.out.println( emps.get(index));
		}
		
		
		
		
		
	}
}
