package basicprogramsjava;
import java.io.*;
import java.util.*;

public class CopyString {
	
	public static void main(String args[])
	{
		System.out.print("Enter the string to be copied:  ");
		
		//getting the String from the user
		Scanner input = new Scanner(System.in);
		String str_1 = input.nextLine();
		int str_len = str_1.length();
		
		char charArray_1[] = str_1.toCharArray();
		char charArray_2[] = new char[str_len];
		
		//copying the str_1 to str_2
		for(int iterator = 0; iterator < str_len; iterator++)
		{
			charArray_2[iterator] = charArray_1[iterator];
		}
		String str_2 = new String(charArray_2);
		
		//printing the copied string
		System.out.print("the copied string is:  "+str_2);
	}

}
