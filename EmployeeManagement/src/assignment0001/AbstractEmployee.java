package assignment0001;

public abstract class AbstractEmployee {
	
	private String employeeName;
	private String employeeNID;
	
	
	
	public AbstractEmployee(String employeeName, String employeeNID) {
		this.employeeName = employeeName;
		this.employeeNID = employeeNID;
	}

	


	public String getEmployeeName() {
		return employeeName;
	}




	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}




	public String getEmployeeNID() {
		return employeeNID;
	}




	public void setEmployeeNID(String employeeNID) {
		this.employeeNID = employeeNID;
	}




	public abstract double calculateSalary();

}
