import java.util.Scanner;

public class MyNameAndAge {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please write your name");
		String name = keyboard.nextLine();
		System.out.println("Please write your age"); 
		int age = keyboard.nextInt();
		System.out.println(" My name is: " + name + " My age is: " + age);
	}

}
