package day03_variables;

public class CubeVolumeCalculator {

	public static void main(String[] args) {
		
		/*Task: Create a program that calculates the volume of a cube using the side length variable.
		 *  The program should have a variable for the side length, and then use it to calculate the volume of
		 *   the cube. Finally, the program should display the volume of the cube on the screen.  
		 *   Instructions: 
		 *    Create a new Java file and name it "CubeVolumeCalculator". 
		 *    Create a variable named "sideLength" and initialize it with a value of 5.0 
		 *    Calculate the volume of the cube using the formula: 
		 *    volume = sideLength * sideLength * sideLength 
		 *    Use the System.out.println() method to print out the volume of the cube on the screen.
		 *     Compile and run your program to ensure that it works correctly. 
		 *     Example Output: The volume of the cube with a side length of 5.0 is: 125.0  
		 *     Note:  Make sure to use the appropriate data type for the variable.
		 *      Make sure to follow good coding practices and indentation. 
		 *      You can also try the program with different values for 
		 *      the sideLength variable to check if the program is working correctly*/
		
		double sideLength = 15.0;
		double volume = sideLength * sideLength * sideLength;
		System.out.println(volume);
		System.out.println("The volume of the cube with a side length of 5.0 is: "+volume);
		System.out.println("The volume of the cube with a side length of "+sideLength+" is: "+volume);
		
		

	}

}
