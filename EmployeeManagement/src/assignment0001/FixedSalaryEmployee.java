package assignment0001;

public class FixedSalaryEmployee extends AbstractEmployee {
	
	private String employeeName;
	private String employeeNID;
	private double employeeSalary;
	public FixedSalaryEmployee(String employeeName, String employeeNID, double employeeSalary) {
		super(employeeName,employeeNID);
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeNID() {
		return employeeNID;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void salaryOfFixedEmployee() {
		System.out.println("Employee Name: "+getEmployeeName()+ "Employee NID: "+getEmployeeNID()+"Employee Salary"+getEmployeeSalary());
	}
	@Override
	public double calculateSalary() {
		return getEmployeeSalary();
	}
	
	

}
