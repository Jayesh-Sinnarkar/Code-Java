package al;

import java.util.Objects;

public class Employee {
	private String firstName;
	private String employeeId;

	public Employee(String employeeId) {
		super();
		
		this.employeeId = employeeId;
	}
	
	public Employee(String firstName, String employeeId) {
		super();
		this.firstName = firstName;
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", employeeId=" + employeeId + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeId, other.employeeId);
	}

}
