package basicprogramsjava;
import java.util.*;
import java.io.*;
public class ArraySort extends GetInput {
	
	public static void main(String args[])
	{
		//creating the object of ArraySort to get methods and variables from extended class
		ArraySort ref_var =new ArraySort();
		int arr_1[] = ref_var.getInputs();
		
		//sorting the array
		for(int iterator_1 = 0; iterator_1 < arr_Size; iterator_1++)
		{
			for(int iterator_2 = 0; iterator_2 < arr_Size-1-iterator_1; iterator_2++)
			{
				if(arr_1[iterator_2]>arr_1[iterator_2+1])
				{
					int temp = arr_1[iterator_2];
					arr_1[iterator_2] = arr_1[iterator_2 + 1];
					arr_1[iterator_2 + 1] = temp;
				}
			}
		}
		
		//printing the array
		System.out.print("The sorted array is:  ");
		for(int iterator_1 = 0; iterator_1 < arr_Size; iterator_1++)
		{
			System.out.print(arr_1[iterator_1]+" ");
		}
	}
			
}
