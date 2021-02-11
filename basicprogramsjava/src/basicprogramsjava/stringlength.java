package basicprogramsjava;
import java.io.*;
import java.util.*;
public class stringlength {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char ch[] = s.toCharArray();
		int len = 0;
		try
		{
			while(ch[len] != '\n')
			{
				len++;
			}
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			System.out.print(len);
		}
	}

}
