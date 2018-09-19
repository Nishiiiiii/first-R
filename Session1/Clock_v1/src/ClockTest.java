import java.util.Scanner;
public class ClockTest
{
public static void main(String[]args)
{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println(" Please write hour: ");
	int hour=keyboard.nextInt();	
	keyboard.nextLine();
	
	System.out.println(" Please write minute: ");
	int minute=keyboard.nextInt();	
	keyboard.nextLine();
	
	System.out.println(" Please write second: ");
	int second=keyboard.nextInt();
	keyboard.nextLine();
	
	
	
	Clock Clock1 = new Clock(hour, minute, second);
	System.out.print(" Hour is: " + Clock1.gethour());
	System.out.print(" Minute is: " + Clock1.getminute());
	System.out.print(" Second is: " + Clock1.getsecond());
	System.out.print(" Total in second: "+ Clock1.getTimeInSeconds());
	System.out.println(" Simple time is: " + Clock1.getSimpleTime());
	System.out.println(" Clock is: " + Clock1.toString());
	
	
	
	
	}
	
	
}
