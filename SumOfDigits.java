package week1.assignments;

public class SumOfDigits  
{  
	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1) SumOfDigits Logic
	 * 2) Looping
	 * 3) Use of variables effectively
	 * 
	 */
	
	public static void main(String args[])  
	{  
		int number = 555;
		
		int reminder, sum = 0;
  
		while(number > 0)  
		{  
			reminder = number % 10;  
			System.out.println(reminder);
			
			sum = sum + reminder;  
			System.out.println(sum);
			
			number = number / 10;
			System.out.println(number);
		}
		
		System.out.println("Sum of Digits: "+sum);  
	}  
}  
