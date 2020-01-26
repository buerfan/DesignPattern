package assignment0001;

public class EmployeeManage {

	public static void main(String[] args) {
		
		FixedSalaryEmployee abstractEmployee=new FixedSalaryEmployee("Md. ", "5697485", 12000);
		System.out.println(abstractEmployee.calculateSalary());
	}

}
