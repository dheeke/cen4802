import java.util.Scanner;

public class NthFibonacci
{
	

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