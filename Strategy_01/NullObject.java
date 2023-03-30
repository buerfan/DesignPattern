package Strategy_01;

public class NullObject implements Strategy{
	
	@Override
	public String GolaGuliKorbe(String bondukName) {
		// TODO Auto-generated method stub
		String damage = "There no bonduk name as "+bondukName;
		if (bondukName == null) {
			return damage;
		}
		else {
			return damage;
		}

	}
	
}
