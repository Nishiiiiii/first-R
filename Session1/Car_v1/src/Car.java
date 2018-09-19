
public class Car {

	private String make;
	private String model;
	private String colour;
	private boolean manualGear;
	
	public Car(String make, String model, String colour, boolean manualGear)
	{
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.manualGear = manualGear;
	}
	
	public String getmake()
	{
		return make;
	}
	
	public String getmodel()
	{
		return model;
	}
	
	public String getcolour()
	{
		return colour;
	}
	
	public boolean hasmanualGear()
	{
	return manualGear;
	}
	
	public void setColor(String colour) {
	    this.colour = colour;
	}
	
	public String toString()
	{
		return colour + " " + make + " " + model + " " + "with " + manualGear;
	}
	
	
	
	
}
