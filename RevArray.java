//Question : Reverse a given array

import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = 0;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
