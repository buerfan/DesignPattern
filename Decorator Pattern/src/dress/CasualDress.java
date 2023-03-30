package dress;

public class CasualDress extends DressDecorator {

	public CasualDress(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Adding casual dress feature");
	}

}
