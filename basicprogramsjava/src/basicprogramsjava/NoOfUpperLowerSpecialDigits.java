package basicprogramsjava;// without using inbuilt function
import java.util.*;
import java.io.*;

public class NoOfUpperLowerSpecialDigits {
	
	public static void main(String Args[])
	{
		System.out.println("Enter a String:  ");
		
		//getting the string from the user
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int str_len = str.length();
		char char_array[] = str.toCharArray();
		
		int upper_case = 0;
		int lower_case = 0;
		int special_char = 0;
		int digits = 0;
		
		//counting the uppercase, lowercase, special characters and digits
		for(int iterator = 0; iterator < str_len; iterator++)
		{
			if(char_array[iterator] >= 'A' && char_array[iterator] <= 'Z')
			{
				upper_case++;
			}
			else if(char_array[iterator] >= 'a' && char_array[iterator] <= 'z')
			{
				lower_case++;
			}
			else if(char_array[iterator] >= '0' && char_array[iterator] <= '9')
			{
				digits++;
			}
			else
			{
				special_char++;
			}
		}
		
		//printing the counts
		System.out.println("No of Uppercase is " + upper_case);
		System.out.println("No of Lowercase is " + lower_case);
		System.out.println("No of Special is " + special_char);
		System.out.println("No of Digits is " + digits);
	}
}
