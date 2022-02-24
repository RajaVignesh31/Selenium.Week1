package week1.assignments;

public class MyCalculator 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println("Result of Addition = "+ calc.add(1, 2, 3));
		System.out.println("Result of Subraction = "+ calc.sub(10, 5));
		System.out.println("Result of Multiplication = "+ calc.mul(2, 3));
		System.out.println("Result of Division = "+ calc.div(10, 5));
	}
}
