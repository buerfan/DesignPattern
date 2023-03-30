package dress;

public class FancyDress extends DressDecorator{

	public FancyDress(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("adding fancy dress features");
	}
	
}
