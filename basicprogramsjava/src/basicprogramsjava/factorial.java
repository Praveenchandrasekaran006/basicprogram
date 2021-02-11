package basicprogramsjava;
import java.io.*;
import java.util.*;
public class factorial {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long mul = 1;
		for(int i=n; i>=1; i--)
		{
			mul = mul*i;
		}
		System.out.print(mul);
	}

}
