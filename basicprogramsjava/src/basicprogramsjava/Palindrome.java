package basicprogramsjava;

import java.io.*;
import java.util.*;

public class Palindrome {
	
	public static void main(String args[])
	{
		System.out.println("Enter a String: ");
		
		//getting the string from the user
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int str_len = str.length();
		char char_array[] = str.toCharArray();
		
		System.out.print("The entered String is ");
		
		//validating the string is palindrome or not
		for(int iterator_1 = 0,iterator_2 = str_len-1; iterator_1 < iterator_2; iterator_1++, iterator_2--)
		{
			if(char_array[iterator_1] == char_array[iterator_2])
				continue;
			else
			{
				System.out.print("not a Palindrome");
				return;
			}
		}
		System.out.print("a palindrome");
	}
}
