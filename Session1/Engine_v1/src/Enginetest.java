import java.util.Scanner;
public class Enginetest {

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
System.out.println("please enter type of engine: ");
String type = input.nextLine();

System.out.println("please enter horsePower: ");
int horsePower = input.nextInt();
input.nextLine();

System.out.println("Please enter volume: ");
int volume = input.nextInt();
input.nextLine();

System.out.println("Diesel");
boolean isDiesel = input.hasNext();

Engine Engine1 = new Engine(type, horsePower, volume, isDiesel);
System.out.println("the type is: " + Engine1.gettype());
System.out.println("it has horsePower: " + Engine1.gethorsePower());
System.out.println("the cylinder volume is: " + Engine1.getvolume());
System.out.println("it is diesel: " + Engine1.getisDiesel());
System.out.println("the car engine is: " + Engine1.toString());

Engine Engine2 = new Engine(type, horsePower, volume, false);
System.out.println("the type is: " + Engine2.gettype());
System.out.println("it has horsePower: " + Engine2.gethorsePower());
System.out.println("the cylinder volume is: " + Engine2.getvolume());
System.out.println("it is diesel: " + Engine2.getisDiesel());
System.out.println("the car engine is: " + Engine2.toString());





































	}

	
	
	
	
	
	
	
}
