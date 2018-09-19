import java.util.Scanner;
public class CarTest {

	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
System.out.println("please enter car manufactor: ");
String make = input.nextLine();

System.out.println("please enter car model: ");
String model = input.nextLine();

System.out.println("Please enter colour: ");
String colour = input.nextLine();


System.out.println("manualGear yes or no: ");
boolean manualGear = input.hasNext();

Car Car1 = new Car(make, model, colour, manualGear);
System.out.println("the manufactor is: " + Car1.getmake());
System.out.println("the model is: " + Car1.getmodel());
System.out.println("the colour is: " + Car1.getcolour());
System.out.println(" does it have manualGear: " + Car1.hasmanualGear());
System.out.println("the car is an : " + Car1.toString());


	
	
	
	
	
	
	
}
}