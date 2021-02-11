package basicprogramsjava;
import java.io.*;
import java.util.*;
public class palindrome {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = s.length();
		char ch[] = s.toCharArray();
		for(int i=0,j=n-1; i<j; i++,j--)
		{
			if(ch[i] == ch[j])
				continue;
			else
			{
				System.out.print("Not a Palindrome");
				return;
			}
		}
		System.out.print("palindrome");
	}
}
