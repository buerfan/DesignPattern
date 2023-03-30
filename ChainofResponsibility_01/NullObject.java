package ChainofResponsibility_01;

public class NullObject implements Chain{
	private Chain nextChain;

	@Override
	public void setNext(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}


	@Override
	public void ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		System.err.println("None Can Solve");
		
	}

}
