package basicprogramsjava; //print entire series
import java.util.*;
import java.io.*;

public class Fibonacci {
	
	public static int fib(int num)
	{
		//constructing the fibonacci series using recursion
		if(num == 1)
			return 0;
		if(num == 2)
			return 1;
		return fib(num-1)+fib(num-2);
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the number:  ");
		
		//getting the number from the user
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		//calling the fibonacci function and printing the entire series
		System.out.println("The fibonacci series is:  ");
		for(int iterator = 1; iterator <= num; iterator++)
		{
			System.out.print(fib(iterator)+" ");
		}
		
	}
}
