//Pranab k nath
// in this program we used arraylist and array to accomplish some simple calculation


import java.lang.Integer;
import java.util.ArrayList;
import java.util.Scanner;


public class Calculation {
	
	public static void main(String[] args) {
		
		float ans[] = calculator();
		System.out.println("type the kind of calculation you want to do:");
		System.out.println("Hints: add, sub, multi, div");
		Scanner scan1 = new Scanner(System.in);
		String choice = scan1.nextLine();
		
		if(choice.equals("add"))
		{
			 
			System.out.println("sum of the numbers is: "+ ans[0]);
		}
		
		if(choice.equals("sub"))
		{
			 
			System.out.println("so the answer is: "+ ans[1]);
		}
		
		if(choice.equals("multi"))
		{
			 
			System.out.println("so answer is: "+ ans[2]);
		}
		
		if(choice.equals("div"))
		{
			 
			System.out.println("so answer is: "+ ans[3]);
		}
		
	}

		 static float[] calculator()
		{
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			Scanner scan = new Scanner(System.in);
	    System.out.println("enter the numbers one by one and type 'done' to finish");
	  
	    
	    while (scan.hasNextInt())
	    {  	
	      numbers.add(scan.nextInt());
	      //System.out.println("sum of the numbers is: "+sum);
	    }   
		
		
		System.out.println("number you entered is: "+numbers);
		Integer[] arr = numbers.toArray(new Integer[numbers.size()]);
		float ans[]= new float [4];
		float div = arr[0];
		float sub = arr[0];
		float sum = arr[0];
		float multi = arr[0];
		for (int i=1;i<arr.length;i++)
		{
			
			sum += arr[i];
			sub -= arr[i];
			multi *= arr[i];
			div /= arr[i];
			//ans[0]=sum;
			//ans[1]=sub;
			//ans[2]=multi;
			//ans[3]=div;
		}
		ans[0]=sum;
		ans[1]=sub;
		ans[2]=multi;
		ans[3]=div;
//System.out.println("sum of the numbers is: "+ ans[0]);
//System.out.println("sub of the numbers is: "+sub);
//System.out.println("sub of the numbers is: "+multi);
//System.out.println("sub of the numbers is: "+div);
		
return ans;
	}

}
