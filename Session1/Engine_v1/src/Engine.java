
public class Engine {

	private String type;
	private int horsePower;
	private int volume;
	private boolean isDiesel;
	
	public Engine(String type, int horsePower, int volume, boolean isDiesel)
	{
		this.type= type;
		this.horsePower= horsePower;
		this.volume= volume;
		this.isDiesel= isDiesel;
		
	}
	
	public Engine(String type, int horsePower, int volume)
	{
		this.type= type;
		this.horsePower= horsePower;
		this.volume= volume;
		this.isDiesel= true;
	}
	
	public String gettype()
	{
		return type;
	}
	
	public int gethorsePower()
	{
		return horsePower;
	}
	
	public int getvolume()
	{
		return volume;
	}
	
	public boolean getisDiesel()
	{
		return isDiesel;
	}
	
	public String toString()
	{
	return type + " " + horsePower + "hp " + volume + " " + isDiesel;
	}
	
	
	
	
	
	
}
