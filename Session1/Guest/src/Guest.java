
public class Guest 
 {
	private String name;
	
	public Guest( String name)
	{
	this.name= name;
	}
	public String getname()
	{
		return name;
	}
	public boolean equals(Object o) {
		
	    if (o == this) {
	      return true;
	    }
	    if (!(o instanceof Guest)) {
	      return false;
	    }
	    Guest cc = (Guest)o;
	    return cc.name == name;
	  }
	
	 public String toString()
	{
		return name ;
	}
	
}
	
	
	
	
	

