package factory;

public class FactoryPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Vehicle car = VehicleFactory.getInstance("car", 4);
		  System.out.println(car);
		    
		  Vehicle bike = VehicleFactory.getInstance("bike", 2);
		  System.out.println(bike);
		}
}
