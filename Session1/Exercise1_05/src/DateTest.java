import rentalcompany.model.*;
public class DateTest {

	public static void main(String[] args)
	{
		MyDate birthday = new MyDate(2, 5, 1990);
		System.out.println("My birthday is: " + birthday);
	
		MyDate today = new MyDate();
		int days = birthday.daysBetween(today);
		System.out.println("I am " + days + " days old ");
		int years = birthday.yearsBetween(today);
		System.out.println("I am " + years + " years old ");
	}

}
