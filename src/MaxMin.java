//pranab k nath
// its a small program to determine the maximum and minimum number from a given array


public class MaxMin {
	
	public static void main(String[] args) {
		int numbers[] = {40,1,3,5,7,9,19,24,29,39};
		int max = 0; //or int max = numbers[0];
		int minima = numbers[0];
		//System.out.println("numberes"+numbers[1]);
		for (int i=0;i<numbers.length;i++)
		{
			
			if(max<numbers[i])
				max=numbers[i];
			if(numbers[i]<minima)
				minima = numbers[i];
		}
System.out.println("max number is: "+max);
System.out.println("max number is: "+minima);
	}

}
