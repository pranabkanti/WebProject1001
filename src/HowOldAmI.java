
//pranab k nath
///its a simple java program  basically takes an integer(age) from the user 
//and determine the stage of life of a person
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class HowOldAmI {
	public static void main(String[] args) {
		String b= "yes";
		
		
		System.out.println("input the age of you");
		Scanner scan = new Scanner(System.in);
		int myint= scan.nextInt();
	
		while(myint!=0)
		{
		
		if(myint>0 && myint<10)
		{
			System.out.println("you are a children yet");
		}
		else if(myint>=10 && myint<20)
		{
			System.out.println("whats up boy");
		}
		else if(myint>=20 && myint<30)
			{
				System.out.println("hey young man");
			}
		else if(myint>=30 && myint<50)
		{
			System.out.println("hi man...its time to start your savings");
			
			
		}
		else if(myint>=50)
		{
			System.out.println("you are getting old");
		}
		
		
		
		
		
		System.out.println("would you like to cheak one more time? type yes or no");
		Scanner input = new Scanner(System.in);
		String a = input.next();

		
		
		if(a.equals("yes"))
		{
			System.out.println("alright! enter the next number");
			
			Scanner scan1 = new Scanner(System.in);
			myint= scan.nextInt();
			
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
		}
		
		
		}
	
}