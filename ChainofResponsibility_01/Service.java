package ChainofResponsibility_01;

public class Service {
	private String problem, name;
	private int num1, num2;

	
	public Service(String problem, String name, int num1, int num2) {
		super();
		this.problem = problem;
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
	}

	public String getProblem() {
		return problem;
	}

	public String getName() {
		return name;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	
	public void ShowDetails() {
		System.out.println("-----------------------------");
		System.out.println("Client Name: "+name+" => Problem: "+problem.toUpperCase());
	
	}
}
	

	