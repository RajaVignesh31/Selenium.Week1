package week1.assignments;

public class PrimeNumber 
{
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Logic
	 * 2) Looping (Iteration)
	 * 3) Conditional
	 */

	public static void main(String[] args) 
	{
		int number = 13;

		boolean flag = false;		

		for(int i = 2; i <= number/2; i++)		
		{
			if(number % i == 0)
			{
				flag = true;
				break;
			}
		}

		if(!flag)
		{
			System.out.println(number + " is a Prime Number");
		}
		else		   
		{
			System.out.println(number + " is not a Prime Number");
		}
	}
}
