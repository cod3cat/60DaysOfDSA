import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        
        int arr[] = {10,4,2,-1,9,15,3,0};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        boolean isSorted = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    isSorted = true;
                }
            }

            if (!isSorted) {
                break;
            }
        }

        return arr;
    }
}
