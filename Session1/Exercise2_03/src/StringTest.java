import java.util.Scanner;

public class StringTest {

	public static void main(String[] args)
	{
		// a
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a message");
		String message = keyboard.nextLine(); 
		
		// b		
		int messageLength = message.length();
		System.out.println("The length of the message you entered was: = " + messageLength);
		
		// c
		char firstCharacter = message.charAt(0);
		System.out.println("The first character in your message was = " + firstCharacter);
		
		// d
		char lastCharacter = message.charAt(message.length() - 1);
		System.out.println("The last character in your message was = " + lastCharacter);
		
		System.out.println("UpperCase = " + message.toUpperCase());
		
		System.out.println("LowerCase = " + message.toLowerCase());
	}
	
}
