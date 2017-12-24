//in this program i just practiced with array of string and using a for loop
// where I just tried to printout a user given number of fruit name.   


import java.util.Scanner;

public class stringloop {
	public static void main(String[] args) {
		
		System.out.println("enter the number of fruits you want to print");
		Scanner scan = new Scanner(System.in);
		int numofFruit= scan.nextInt();
		
		String[] fruits = new String[numofFruit]	;
		
		int n=1;
		
		for(int i=0; i<fruits.length; i++)
		{
		System.out.println("enter the name of fruit no:" + (n+i));
		Scanner scan1 = new Scanner(System.in);
		fruits[i]= scan1.nextLine();
		}
		System.out.println("you entered: ");
	    for(int m = 0; m<fruits.length; m++)
		{
			System.out.println(fruits[m]);
			
		}
		
		}
	}

