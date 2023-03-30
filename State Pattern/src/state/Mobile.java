package state;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileContext mobileContext = new MobileContext();
		mobileContext.alert();
		
		mobileContext.setState(new Silent());
		
		mobileContext.alert();
	}

}
