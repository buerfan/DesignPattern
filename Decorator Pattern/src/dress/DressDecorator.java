package dress;

public class DressDecorator implements Dress{

	protected Dress dress;
	
	public DressDecorator(Dress dress) {
		super();
		this.dress = dress;
	}
	
	

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		this.dress.assemble();
	}

}
