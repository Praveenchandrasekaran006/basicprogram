package basicprogramsjava;//without inbuilt//with using only one scanner
import java.util.*;
import java.io.*;
public class SortStringArray {
     public static void main(String Args[])
     {  	 
    	 //getting the string array size and strings from the user
    	 
    	 System.out.println("Enter the Size of the string array:  ");
    	 Scanner input = new Scanner(System.in);
    	 String str_temp = input.nextLine();
    	 int str_array_len = Integer.parseInt(str_temp);
    	 
    	 String str_arr[] = new String[str_array_len];
    	 System.out.println("Enter the Strings to be Sorted:  ");
    	 for(int iterator = 0; iterator < str_array_len; iterator++)
    	 {
    		 str_arr[iterator] = input.nextLine();
    	 }
    	 
    	 //sorting the string array
    	 String temp;
    	 for(int iterator_1 = 0; iterator_1 < str_array_len; iterator_1++)
    	 {
    		 for(int iterator_2 = 0; iterator_2 < str_array_len-iterator_1-1; iterator_2++)
    		 {
    			 if(str_arr[iterator_2].compareTo(str_arr[iterator_2+1]) > 0)
    			 {
    				 temp = str_arr[iterator_2];
    				 str_arr[iterator_2] = str_arr[iterator_2 + 1];
    				 str_arr[iterator_2 + 1] = temp;
    			 }
    		 }
    	 }
    	 
    	 //printing the sorted array
    	 System.out.println("The sorted strings are: ");
    	 for(int iterator = 0; iterator < str_array_len; iterator++)
    	 {
    		 System.out.print(str_arr[iterator]+" ");
    	 }
    	 
     }
}
