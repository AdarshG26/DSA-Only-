//Question : Remove duplicate elements from an array.

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main (String []argu)
    {
        int arr[] = {1,2,3,2,7,1,4,5,6,7};
         Arrays.sort(arr);
         int temp[] = new int[arr.length];
         int j=0;
         
         for(int i=0; i<arr.length-1; i++)
         {
             if(arr[i] !=arr[i+1])
             {
                 temp[j] = arr[i];
                 j++;
             }
         }
         temp[j] = arr[arr.length-1];
         j++;
         
         System.out.println("Array :");
         for(int i=0; i<j; i++)
         {
             System.out.print(temp[i] +" ");
         }
        
    }
}