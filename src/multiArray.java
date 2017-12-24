//Pranab k Nath
// a simple program using multidimentional Array with integers and later with string....
//also we will see how the system prints null for the undeclared array


public class multiArray {
	public static void main(String[] args) {
		
/*	int[]values= {1,2,3,4};
	System.out.println(values[2]);
	int[][]grid = {	
			{1,2,3},
			{12,23,34,45},
			{123,234,345}		
	};
	
	System.out.println(grid[1][2]);
	for(int row=0; row<grid.length; row++)
	
	{
		for(int col=0; col<grid[row].length; col++)
		{
		System.out.print(grid[row][col] +"\t");
		
	}
		System.out.println();
	}  
	*/
		
		// now commentting out the integer block we will play with the sring 
		
	String[][] words = new String[3][4];
	
	words[0][0]= "when";
	words[0][1]= "humanity";
	words[0][2]= "is";
	words[0][3]= "there";
	words[1][0]= "lord";
	words[1][1]= "creates";
	words[1][2]= "another";
	words[1][3]= "heaven";
	words[2][0]= "there";
	words[2][1]= " ";
	words[2][2]= " ";
	words[2][3]= " ";
	for(int i=0; i<words.length; i++){
		//System.out.print(words[i][0] + " ");
		for(int j=0; j<words[i].length; j++){
			System.out.print(words[i][j] + "\t");
			
		}
		System.out.println();
	}
	
	}

}
