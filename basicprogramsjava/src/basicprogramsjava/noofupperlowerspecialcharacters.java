package basicprogramsjava;
import java.util.*;
import java.io.*;
public class noofupperlowerspecialcharacters {
	public static void main(String Args[])
	{
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = s.length();
		char ch[] = s.toCharArray();
		int uppercase = 0;
		int lowercase = 0;
		int specialchar = 0;
		int digits = 0;
		
		for(int i=0; i<n; i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch[i]))
			{
				lowercase++;
			}
			else if(Character.isDigit(ch[i]))
			{
				digits++;
			}
			else
			{
				specialchar++;
			}
		}
		System.out.println("No of Uppercase is "+uppercase);
		System.out.println("No of Lowercase is "+lowercase);
		System.out.println("No of Special is "+specialchar);
		System.out.println("No of Digits is "+digits);
	}
}
