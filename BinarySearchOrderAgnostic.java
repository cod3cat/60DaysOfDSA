import java.util.Arrays;

public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        int[] arr1 = {98,75,23,19,11,7,2,1};
        int[] arr2 = {1, 2, 7, 11, 19, 23, 75, 98};

        int target = 19;
        
        System.out.println(findElement(arr2, target));
    }

    static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
