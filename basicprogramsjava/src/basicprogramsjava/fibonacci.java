package basicprogramsjava;
import java.util.*;
import java.io.*;
public class fibonacci {
	
	public static int fib(int n)
	{
		if(n == 1)
			return 0;
		if(n == 2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int c = fib(n);
		System.out.print(c);
	}
}
