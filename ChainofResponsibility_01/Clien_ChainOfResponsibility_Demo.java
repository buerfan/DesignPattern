package ChainofResponsibility_01;


public class Clien_ChainOfResponsibility_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain c1 = new FrontDesk();
		Chain c2 = new Supervisor();
		Chain c3 = new Manager();
		Chain c4 = new Director();
		Chain last = new NullObject();
		
		c1.setNext(c2);
		c2.setNext(c3);
		c3.setNext(c4);
		c4.setNext(last);

		
		Service request = new Service("Bou", "Pranta", 206, 20);
		c1.ServiceSupport(request);

	}

}
