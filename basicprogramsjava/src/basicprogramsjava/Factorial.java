package basicprogramsjava;// using recursion
import java.io.*;
import java.util.*;

public class Factorial {
	public static int fact(int num)
	{
		if(num == 0)
			return 1;
		
		return num*fact(num-1);
	}
	public static void main(String args[])
	{
		//getting the number from the user
		System.out.print("Enter the Number:  ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		
		int mul = fact(num);
		
		System.out.print(mul);
	}

}
