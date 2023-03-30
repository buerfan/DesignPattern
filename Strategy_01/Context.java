package Strategy_01;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public String executeStrategy(String bondukName) {
		return strategy.GolaGuliKorbe(bondukName);
	}

}
