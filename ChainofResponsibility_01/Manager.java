package ChainofResponsibility_01;


public class Manager implements Chain{
	private Chain nextChain;

	@Override
	public void setNext(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}

	String problem, name;
	int num1, num2;
	@Override
	public void ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		problem = request.getProblem();
		name = request.getName();
		num1 = request.getNum1();
		num2 = request.getNum2();
		if(problem.equalsIgnoreCase("multiply") || problem == "mul") {
			
			System.out.println("Manager Can Solve");
			request.ShowDetails();
			System.out.println("Solution: ("+problem+") = "+num1*num2);
			
		}
		else if(problem == "add") {
			System.out.println("Manager also Can Solve");
			request.ShowDetails();
			System.out.println("Solution: ("+problem+") = "+num1+num2);
			
		}
		
		else if(problem == "sub" || problem == "substract") {
			
			System.out.println("Manager Can Solve");
			request.ShowDetails();
			System.out.println("Solution: ("+problem+") = "+(num1-num2));
			
		}

		else {
			System.out.println("Manager Can not Solve....Going for next");
			nextChain.ServiceSupport(request);
		}
		
		
		
	}
}