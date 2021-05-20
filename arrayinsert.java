import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class arrayinsert
{
public static void main (String[] args)
 {

      int[] arr = { 1, 2, 3 };
    //  System.out.println(Arrays.toString(arr));
      arr = Arrays.copyOf(arr, arr.length+1);
  System.out.println(Arrays.toString(arr));
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      arr[arr.length - 1] = number;
      System.out.println(Arrays.toString(arr));
    }
}




