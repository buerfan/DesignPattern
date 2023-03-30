package Strategy_01;


public class MyBonduks {
	public static final String[] bonduks = {"AK-47", "AK47", "AKEFourtySeven", "M-16", "MSixteen","M16"};
	private static Context con1 = new Context(new AKEFourySeven_Strategy());
	private static Context con2 = new Context(new MSixteenRifle_Strategy());
	
	private static Context nullobj = new Context(new NullObject());
	
	public static String getStrategy(String bonduk) {
		System.out.println("Searching For: "+bonduk);
	      if (bonduks[0].equalsIgnoreCase(bonduk) || bonduks[1].equalsIgnoreCase(bonduk) || bonduks[2].equalsIgnoreCase(bonduk)){
	      return con1.executeStrategy(bonduk);
	      }
	      else if(bonduks[3].equalsIgnoreCase(bonduk) || bonduks[4].equalsIgnoreCase(bonduk) || bonduks[5].equalsIgnoreCase(bonduk)) {
	    	  return con2.executeStrategy(bonduk);
	      }
	      return nullobj.executeStrategy(bonduk);
	}

}
