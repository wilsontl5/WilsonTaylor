/**************************************************
* Project 2: Palindrome Check
***************************************************
* This program allows the user to input a four digit
* number or randomly selects a 4 digit number then 
* determines if it is a palindrome 
* Taylor Wilson
* 2/4/2020
* CMSC 255-003
***************************************************/ 
/**************************************************
* Imports Scanner from java utility
***************************************************/
import java.util.Scanner;

/**************************************************
* Names the class 
***************************************************/
public class PalindromeCheck {
	public static void main(String[] args) {
/**************************************************
* Makes scanner an object
***************************************************/
	Scanner input = new Scanner(System.in);
/**************************************************
* declare and initialize fourDigitNumber
***************************************************/
	int fourDigitNumber = 9999;

/**************************************************
* Request input of 0 or 1 and assigns it to numberChoice
***************************************************/
	System.out.println("Enter 0 if you would like to enter a 4-digit number.  Enter 1 if you would like to have the computer generate it.");
	int numberChoice = input.nextInt();

/**************************************************
* if user chooses 1, program will generate a number between 1000 and 9999
***************************************************/
	if (numberChoice == 1){
		fourDigitNumber = (int)(Math.random() * 8999) + 1000;
		System.out.println(fourDigitNumber);
	}
/**************************************************
* if user chooses 0, program will prompt user for a four digit number
***************************************************/
	else if (numberChoice == 0){
		System.out.println("Enter the 4-digit number:");
		fourDigitNumber = input.nextInt();
/***************************************************
* sets the range for the users inputed number. if it is less 1000
* of greater than 9999, program print "Incorrect input"
****************************************************/
		if (fourDigitNumber < 1000 || fourDigitNumber > 9999)
			System.out.println("Incorrect input");
	}
/**************************************************
* isolates the thousands place digit by dividing by 1000
***************************************************/
    if (numberChoice == 1 || numberChoice == 0 && !(fourDigitNumber < 1000 || fourDigitNumber > 9999)){
		int thousandsPlace = fourDigitNumber / 1000;
    
/**************************************************
* isolates the hundreds place by finding the remainder of fourDigitNumber / 1000 
* then dividing the remainder by 100 
***************************************************/
		int hundredsPlace1 = fourDigitNumber % 1000;
		int hundredsPlace = hundredsPlace1 / 100;
/**************************************************
* isolates the tens place by finding the remainder of fourDigitNumber / 100
* then dividing the remainder by 10 
***************************************************/
		int tensPlace1 = fourDigitNumber % 100;
		int tensPlace = tensPlace1 / 10;
/**************************************************
* isolates the ones place by finding the remainder of fourDigitNumber / 10
***************************************************/
		int onesPlace = fourDigitNumber % 10;

/**************************************************
* compares the thousandsPlace to the onesPlace and the hundredsPlace to the tensPlace
* uses && operator to determine if both statements are true then display that it is a palindrome
***************************************************/
			if (thousandsPlace == onesPlace && hundredsPlace == tensPlace)
				System.out.println(fourDigitNumber + " is a palindrome");
	
/**************************************************
* if either one of the statements above is not true then it will display that it is not a palindrome
***************************************************/
			else 
				System.out.println(fourDigitNumber + " is not a palindrome");
	}

/**************************************************
* if a number not 0 or 1  is entered, display Incorrect Input message
* need the range stated so that program does not print a double "Incorrect input"
***************************************************/
		else if(!(numberChoice == 1 || numberChoice == 0) && !(fourDigitNumber < 1000 || fourDigitNumber > 9999)) {
			System.out.println("Incorrect input");
		}
	}
}

