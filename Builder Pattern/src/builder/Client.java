package builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car = new VehicleBuilder("1500cc", 4).setAirbags(4).build();
	    Vehicle bike = new VehicleBuilder("250cc", 2).build();
	    
	    System.out.println(car.getEngine());
	    System.out.println(car.getWheel());
	    System.out.println(car.getAirbags());
	    
	    System.out.println(bike.getEngine());
	    System.out.println(bike.getWheel());
	    System.out.println(bike.getAirbags());
	}

}
