package basicprogramsjava;
import java.io.*;
import java.util.*;
public class BigElement extends GetInput {
	
	public static void main(String args [])
	{
		//getting the array size and array from the user
		BigElement ref_var = new BigElement();
		int arr[] = ref_var.getInputs();
		
		int max = 0;
		for(int iterator_1=0; iterator_1<arr_Size; iterator_1++)
		{
			if(arr[iterator_1] > max)
				max = arr[iterator_1];
		}
		
		System.out.print("The biggest elements is  "+max);
	}
	
}
