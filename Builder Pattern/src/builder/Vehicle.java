package builder;

public class Vehicle {

	public String engine;
	public int wheel;
	  
	  //optional parameter
	public int airbags;
	  
	  public String getEngine() {
	    return this.engine;
	  }
	  
	  public int getWheel() {
	    return this.wheel;
	  }
	  
	  public int getAirbags() {
	    return this.airbags;
	  }
	  
	  public Vehicle(VehicleBuilder builder) {
	    this.engine = builder.engine;
	    this.wheel = builder.wheel;
	    this.airbags = builder.airbags;
	  }
}
