package ChainofResponsibility_01;


interface Chain {
	public void setNext(Chain nextChain);
	public void ServiceSupport(Service request);
	

}
