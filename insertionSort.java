import java.util.Scanner;
public class insertionSort {
     public static void main(String args[])
   {
       int size, i, j, temp;
       int arr[] = new int[50];
       int arr[] = {51,23,17,32,43,88};
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
       
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
       
       System.out.print("Sorting Array using Insertion Sort Technique..\n");
       for(i=1; i<size; i++)
       {
           temp = arr[i];
           j = i ;
           while((temp < arr[j-1]) && (j > 0))
           {
               arr[j] = arr[j-1];
               j = j - 1;
           }
           arr[j] = temp;
       }
       
       System.out.print("Array after Sorting is : \n");
       for(i=0; i<size; i++)
       {
           System.out.print(arr[i] + "  ");
       }
   }
}