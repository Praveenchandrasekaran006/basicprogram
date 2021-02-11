package basicprogramsjava;
import java.util.*;
import java.io.*;
public class sortstringarray {
     public static void main(String Args[])
     {
    	 Scanner in = new Scanner(System.in);
    	 int n = in.nextInt();
    	 String s_arr[] = new String[n];
    	 Scanner in1 = new Scanner(System.in);
    	 for(int i=0; i<n; i++)
    	 {
    		 s_arr[i] = in1.nextLine();
    	 }
    	 Arrays.sort(s_arr);
    	 for(int i=0; i<n; i++)
    	 {
    		 System.out.print(s_arr[i]+" ");
    	 }
    	 
     }
}
