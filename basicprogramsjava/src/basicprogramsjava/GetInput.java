package basicprogramsjava;
import java.util.*;
import java.io.*;

public class GetInput {
	
	static int arr_Size;
	
	public int[] getInputs()
	{
		//getting the array size and array from the user
		System.out.println("enter the array size:  ");
		Scanner input = new Scanner(System.in);
		arr_Size = input.nextInt();
		
		int arr[] = new int[arr_Size];
		
		System.out.println("Enter the array elemnets:  ");
		for(int iterator=0; iterator<arr_Size; iterator++)
		{
			arr[iterator] = input.nextInt();
		}
		
		return arr.clone();
	}

}
