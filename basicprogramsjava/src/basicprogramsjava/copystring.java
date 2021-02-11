package basicprogramsjava;
import java.io.*;
import java.util.*;
public class copystring {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		int n = s1.length();
		char ch1[] = s1.toCharArray();
		char ch2[] = new char[n];
		for(int i=0; i<n; i++)
		{
			ch2[i] = ch1[i];
		}
		String s2 = new String(ch2);
		System.out.print(s2);
	}

}
