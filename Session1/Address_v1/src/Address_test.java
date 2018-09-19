import java.util.Scanner;
public class Address_test
{
public static void main(String[]args)
{
  
   Scanner input = new Scanner(System.in);
   
   
   System.out.println("Please write your street");
    String street=input.nextLine();
   
   System.out.println("Please write your number");
   int number=input.nextInt();
   input.nextLine();
   
   System.out.println("Please write your letter");
   char letter=input.nextLine().charAt(0);
   
   System.out.println("Please write your floor");
   int floor=input.nextInt();
   input.nextLine();
   
   System.out.println("Please write your door");
   int door=input.nextInt();
   input.nextLine();
   
   System.out.println("Please write your town");
   String town=input.nextLine();
   
   Address address1 = new Address (town, street, number, letter, floor, door);

System.out.println("you live in:" + address1.toString());
input.close();
   
   
   
   
   
   

   
   
   
}
   
   
   
   
   
   
   
   
   
   
}
