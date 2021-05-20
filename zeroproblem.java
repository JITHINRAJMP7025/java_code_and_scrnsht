import java.io.*;
public class zeroproblem
{
public static void main (String[] args)
 {
  int arr[] = {0,1,2,0,0,1,6,7,8,9};
  int n = arr.length;
  int count = 0;  
    for (int i = 0; i < n; i++)
        {
        if (arr[i] != 0)
          {
           arr[count] = arr[i]; 
           count++;
          }
         }
       while (count < n)
          {
            arr[count] = 0;
            count++;
          }
     System.out.println("Array after operation ");
      for (int i=0; i<n; i++)
            {
            System.out.print(arr[i]+" ");
            }
    }
}

