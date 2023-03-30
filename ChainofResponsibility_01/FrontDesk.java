package ChainofResponsibility_01;



public class FrontDesk implements Chain{
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
		int sum = num1+num2;
		if(problem.equalsIgnoreCase("add")) {
			System.out.println("FrontDesk Can Solve");
			request.ShowDetails();
			System.out.println(num1+" + "+num2+" Sum ");
			System.out.println("Solution: ("+problem+") = "+sum);
			
		}
		else {
			System.out.println("FrontDesk Can not Solve....Going for next");
			nextChain.ServiceSupport(request);
		}
		
		
		
	}
	
}