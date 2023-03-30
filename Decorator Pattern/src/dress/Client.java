package dress;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dress sportyDress = new SportyDress(new BasicDress());
		sportyDress.assemble();
		System.out.println();
		
		Dress fancyDress = new FancyDress(new BasicDress());
		fancyDress.assemble();
		System.out.println();
		
		Dress casualDress = new CasualDress(new BasicDress());
		casualDress.assemble();
		System.out.println();
		
		Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
		sportyFancyDress.assemble();
		System.out.println();
		
		Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
		casualFancyDress.assemble();
	}

}
