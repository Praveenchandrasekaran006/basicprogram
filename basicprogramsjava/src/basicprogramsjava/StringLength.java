package basicprogramsjava;// about catch
import java.io.*;
import java.util.*;
public class StringLength {
	public static void main(String args[])
	{
		//getting the string from the user
		System.out.print("Enter the String:  ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char char_array[] = str.toCharArray();
		
		int str_len = 0;
		for(char char_val: char_array)
		{
			str_len++;
		}
		
		System.out.print("The length of the given string is "+str_len);
		
	}

}
