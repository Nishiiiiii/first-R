import java.util.Scanner;
public class Email_test
{
public static void main(String[]args)
{
String user,host,domain;
 Scanner email = new Scanner(System.in);
 
 
 System.out.println("Write your user");
 user=email.nextLine();
 
 System.out.println("Write your host");
  host = email.nextLine();
 
 System.out.println("Write your domain");
  domain = email.nextLine();
 
 Email add= new Email(user,host,domain);
 System.out.println("the user is: "+ add.getuser());
 System.out.println("the host is:"+ add.gethost());
 System.out.println("the domain is:"+ add.getdomain());
 System.out.println("the email address is:"+ add.toString());
 
 
 
 

   
   
   
   
   
   
   
   
   
}
}
