/*********************************************************
*DonutSign.java
*********************************************************
* This program calculates the cost for a logene shaped sign 
*with a slogan based on character count and square foot area
*_________________________________________________________
*Taylor Wilson
*2/20/2020
*CMSC 255-03
*********************************************************/
import java.util.Scanner;

public class DonutSign {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
/**********************************************************
* declare and set constants for pricing 
**********************************************************/
		final double COST_PER_SQR_FT = 2.85;
		final double COST_PER_CHARACTER = 1.65;
/**********************************************************
*declare and initialize the string loopIt which will continue 
*the program unless the user reassigns it to match quit string
**********************************************************/
		String loopIt = "yes";
		String quit = "quit";
/**********************************************************
*beings the do/while loop
**********************************************************/
		do {
/**********************************************************
*prompt user for radius, declares and initialized radius r
**********************************************************/			
		System.out.println("Enter the radius of the circles: ");
		int r = input.nextInt();
/**********************************************************
*prompt user for one side of the parallelogram
*declares and initializes as integer a 
**********************************************************/
		System.out.println("Enter the first side of the parallelogram: ");
		int a = input.nextInt();
/**********************************************************
*prompt user for second side of the parallelogram
*declares and initializes as integer b
**********************************************************/
		System.out.println("Enter the second side of the parallelogram: ");
		int b = input.nextInt(); 
/**********************************************************
*prompt user for angle of the parallelogram
*declares and initializes as integer c
**********************************************************/
		System.out.println("Enter the angle of the parallelogram: ");
		int c = input.nextInt();
/**********************************************************
*clears the register so nextLine can be implimented. 
**********************************************************/
		input.nextLine();
/**********************************************************
*prompt user for string the user would like on the sign
*declares and initializes as string slogan
**********************************************************/
		System.out.println("Enter the string you would like on your sign: ");
		String slogan = input.nextLine(); 
/*********************************************************
*calculations for the area of the 2 halves of the cicrle
*********************************************************/
		double circleArea = (Math.PI) * r * r;
/*********************************************************
*calculations for the area of the parallelogram
*********************************************************/
		double parallelogramArea = a * b * Math.sin(c);
/*********************************************************
*calculations to find the cost of the sign
*********************************************************/
		double signCost = (circleArea + parallelogramArea) * COST_PER_SQR_FT;
/*********************************************************
*trims any whitespace off the ends of the slogan then
*converts the string to all uppercase letters
*********************************************************/
		slogan = slogan.trim();
		slogan = slogan.toUpperCase(); 
/*********************************************************
*initializes and declares count for the nmber of characters 
* counted in the loop, ignoring whitespace
*********************************************************/
		int count = 0;
/*********************************************************
*loop to check each index of the string for a character or
*whitespace, if it is not whitespace, count will increase by 
* one. Loop ends once i is equal to the last index of the string
*********************************************************/
		for (int i = 0; i <= slogan.length()-1; i++){
			if (slogan.charAt(i) != ' ')
				count++;
		}
/*********************************************************
*calculates the cost of the string
*********************************************************/
		double sloganCost = count * COST_PER_CHARACTER;
/*********************************************************
*calculates the total price by adding the area cost and slogan cost
*print the total cost, formatting to 2 decimal places 
*********************************************************/
		double totalCost = sloganCost + signCost;
		System.out.printf("$%4.2f",totalCost);
/*********************************************************
*starts new line and prompts the user if they would like to continue
*********************************************************/
		System.out.println();
		System.out.println("Would you like to create another sign? Enter quit to exit.");
		loopIt = input.nextLine();
/*********************************************************
*continures loop as loong as the user does not input quit in last prompt
* if quit is entered the program is terminated
*********************************************************/
		}while (!loopIt.equals(quit));


	}
}