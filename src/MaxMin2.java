// Pranab k nath
// this is a modified program to give some freedom to the user to enter 
// the elements of the array after running the program which is a kind of 
// user interface program

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Scanner;


public class MaxMin2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter the numbers one by one and enter any non-Integer to finish");
	    while (scan.hasNextInt())
	    {  	
	      numbers.add(scan.nextInt());
	    }   
		
		
		System.out.println("number you entered is: "+numbers);
		Integer[] arr = numbers.toArray(new Integer[numbers.size()]);
		int max = 0; //or int max = numbers[0];
		int minima = arr[0];
		for (int i=0;i<arr.length;i++)
		{
			
			if(max<arr[i])
				max=arr[i];
			if(arr[i]<minima)
				minima = arr[i];
		}
System.out.println("max number is: "+max);
System.out.println("minimam number is: "+minima);
	}

	}
