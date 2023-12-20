package as3_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,45,2,4,0,99};
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            arr = swap(arr, start, end);
            start++;
            end--;
            
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int[] swap(int[] lArray, int startIndex, int endIndex) {{
        int temp = lArray[startIndex];
        lArray[startIndex] = lArray[endIndex];
        lArray[endIndex] = temp;

        return lArray;
    }}

    
}