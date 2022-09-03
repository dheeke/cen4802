import java.util.Scanner;

/**
 * 
 * @author Dennis Heeke
 *@version 1.0
 */

public class NthFibonacci
{
	/**
	 * This is the method that will receive a parameter that represents the
	 * number of Fibonacci elements to be displayed on the console. If the parameter
	 * is 0 the method returns 0. it the parameter is 1 or 2 the method will return
	 *  the value of 1. For any positive value the recursive method is initiated and 
	 *  its value is returned.
	 * @param n The Nth number of the Fibonacci series.
	 * @return
	 */

	public static int calculateFibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1 || n == 2)
		{
				return 1;
		}
		return calculateFibonacci(n-2) + calculateFibonacci(n-1);
	}
	
	   public static void main(String args[])
	   {
		    Scanner console = new Scanner(System.in);
			int nTH = 0;
			System.out.println("Please enter the degree of Fibonacci to be calculated:");
			nTH = console.nextInt();
			System.out.print("\nFibonacci Series of "+ nTH +" degrees: ");
			for(int i = 0; i < nTH; i++)
			{
					System.out.print(calculateFibonacci(i) +" ");
			}
			console.close();
		}
}