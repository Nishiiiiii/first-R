
public class DriversLicence
{
private int number;
private boolean permitForTruck;
private boolean permitForBus;

   public DriversLicence(int number, boolean truck, boolean bus)
    
  {
      
      this.number= number;
     this.permitForTruck= truck;
     this.permitForBus= bus;
     
    
     
         
  }
   public DriversLicence(int number, boolean truckAndBus)
   {
     this(number, truckAndBus, truckAndBus);
     
    }
   
public DriversLicence(int number)

{
   this(number, false, false);
}
   
public int getNumber()
{ 
   return number;
}
public boolean getpermintForTruck()
{
   return permitForTruck;
   
}
   
   
}
