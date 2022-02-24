package week1.assignments;

public class Fibonacci {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 
	 * 1) Logic
	 * 2) Looping
	 * 3) Operators
	 * 
	 */

	public static void main(String[] args) 
	{
		int num1=0, num2=1, sum, range = 8;

		System.out.println(num1);
		
		for(int i=1;i<range;i++)   
		{ 	
			sum = num1+num2;

			num1 = num2;

			num2 = sum;
		
			System.out.println(sum);
		}
	}
}
