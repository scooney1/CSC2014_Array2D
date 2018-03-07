/**
 * Author:	Sam Cooney
 * Project:	Array2D
 * Date:	Nov 15, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

public class Array2D {

	public static void main(String[] args) {	// Begin main.
		Box myBox = new Box(15);			// Instantiate object for class Box.
		int [][] myArray = new int [5][10];	// Instantiate array.
		
		for(int row=0;row<myArray.length;row++) {	// Outer for loop for initializing array.
			for(int col=0;col<myArray[1].length;col++) {	// Inner for loop for initializing array.
				
				myArray[row][col] = row * 10 + col;	// Initialize array values.
			}
		}
		
		System.out.println("The items in the array are: ");
		for(int row=0;row<myArray.length;row++) {	// Outer for loop for printing array.
			for(int col=0;col<myArray[1].length;col++) {	// Inner for loop for printing array.
				
				System.out.print(myArray[row][col] + "\t");
			}
			
			System.out.println();	// Skip a line.
		}
		
		System.out.println();	// Skip a line. 
		System.out.println("The items in row three are: ");
		for(int col=0;col<myArray[1].length;col++) {	// For loop for printing row 3.
			int row = 2;
		
			System.out.print(myArray[row][col] + "\t");
		}
		
		System.out.println("\n");	// Skip two lines.
		myArray[3][4] = 999;	// Change the value 34 to 999.
		System.out.println("The items in the array are: ");
		for(int row=0;row<myArray.length;row++) {	// Outer loop for printing new array.
			for(int col=0;col<myArray[1].length;col++) {	// Inner loop for printing new array.
				
				System.out.print(myArray[row][col] + "\t");
			}
			
			System.out.println();	// Skip a line.
		}
		
		System.out.println();	// Skip a line.
		System.out.println("The items on the diagnal are: ");
		for(int num=0;num<myArray.length;num++) {	// For loop for printing diagonal.
			
			System.out.print(myArray[num][num] + "\t");
		}
		
		System.out.println("\n");	// Skip a line.
		System.out.println("The items listed by columns are: ");
		for(int col=0;col<myArray[1].length;col++) {	// Outer for loop for printing array.
			for(int row=0;row<myArray.length;row++) {	// Inner for loop for printing array.
				
				System.out.print(myArray[row][col] + "\t");
			}
			
			System.out.println();	// Skip a line.
		}
		
		System.out.println();	// Skip a line.
		System.out.println(myBox);	// Print my box.
	}	// End main.

}
