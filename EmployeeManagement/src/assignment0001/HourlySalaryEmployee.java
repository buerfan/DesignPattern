package assignment0001;

public class HourlySalaryEmployee extends AbstractEmployee {

	private double employeeSalary;
	
	public HourlySalaryEmployee(String employeeName, String employeeNID,double employeeSalary ) {
		super(employeeName, employeeNID);
		setEmployeeSalary(employeeSalary);
	}

	
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public double calculateSalary() {
		return getEmployeeSalary();
	}

	
}
