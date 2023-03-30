package dress;

public class SportyDress extends DressDecorator{

	public SportyDress(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	
	public void  assemble() {
		super.assemble();
		System.out.println("Adding sporty dress feature");
	}

}
