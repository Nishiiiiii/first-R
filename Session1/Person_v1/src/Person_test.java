import java.util.Scanner;

public class Person_test
{
public static void main(String[]args)
{
   Scanner input= new Scanner(System.in);
   
   System.out.print("please enter first name: ");
   String firstName = input.nextLine();
   
   
   System.out.println("Please enter last name: ");
 String lastName = input.nextLine();
 
  
 System.out.println("Please enter age: ");  
 int age = input.nextInt();
 
 input.nextLine();
 System.out.println("Please enter gender (M or F):");
 String line = input.nextLine();
 char gender = line.charAt(0);
 input.close();
 
 Name name1 = new Name(firstName, lastName);
 Person person1 =new Person(name1, age, gender);
 
 System.out.println("Name: "+ person1.getName());
 System.out.println("Age: " +person1.getAge());
 System.out.println("Gender: " + person1.getGender());
System.out.println(person1); 
}
}
