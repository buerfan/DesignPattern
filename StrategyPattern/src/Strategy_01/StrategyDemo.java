package Strategy_01;

import java.io.ObjectInputStream.GetField;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------> Strategy <---------");
		Context context = new Context(new MSixteenRifle_Strategy());
		System.out.println(context.executeStrategy("M-16"));
		System.out.println();
		
		Context context2 = new Context(new AKEFourySeven_Strategy());
		System.out.println(context2.executeStrategy("AK-47"));
		
		System.out.println("----------> Strategy End <---------");
		
		
		
//		System.out.println();
//		String value = MyBonduks.getStrategy("AK-47");
//		System.out.println(value);
	}

}
