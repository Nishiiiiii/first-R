
public class Person
{
   private String name;
   private int age; 
   private char gender;
   
  public Person(String name, int age, char gender)
  
  {
    
     // this.name=name;
     //this.age=age;
     //this.gender=gender;
     
     setName(name);
     setAge(age);
     setGender(gender);
          
  }
  
 public Person(String name, char gender)
  
  {
    // this.name=name;
    //this.age=0;
    //this.gender=gender;
    
    this(name, 0, gender);
  } 
    
 public Person(char gender)
 
 {
   // this.name=null;
   //this.age=0;
   //this.gender=gender;
   
   this(null, 0, gender);
 }  
 
 public String getName()
 {
    return name;
    
 }
   public int getAge()
   {
      return age;
      
   }
  public char getGender()
  {
     return gender;
     
     }
 public void setName(String name)
 {
    this.name=name;
    }
 
 public void setAge(int age)
 {
    this.age=age;
    }
 public void setGender(char gender)
 {
    this.gender=gender;
   }
public String toString()
{
   String s="";
   s+=name;
   s+=", age="+age;
   s+=", gender='"+ gender+"'";
 
   
  return s;
   
}
 
}