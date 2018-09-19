
public class Address
{
   
   private String town;
   private String street;
   private int door;
   private int number;
   private int floor;
   private char letter;
   
   public Address(String town, String street, int number, char letter, int floor, int door)
   {
      
      this.town = town;
      this.street = street;
      this.door = door;
      this.number = number; 
      this.floor = floor;
      this.letter = letter;
      
     
      }
      
   public String getTown()
   {
      
     return town;
     
   }
   
   public String getStreet()
   {
      return street;
      }
   public int getDoor()
   {
      return door;
      }
   
   public int getNumber()
   { 
      return number;
      }
   public int getFloor()
   {
   return floor;
   }
   
   public char getLetter()
   {
      return letter;
      
   }
    
   public String getFullNumber()
   
   {
      return number + letter + " " + floor + " " + door;
      }
   
   public String toString()
   {
      return street + " " + number + " " + letter + " " + floor +" "+ door + " "+ town;
  
    
      
   }
   
   
   
   
   
   
}