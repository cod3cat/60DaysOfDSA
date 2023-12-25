package leetCode;

public class _852 {
    //852. Peak Index in a Mountain Array

    public static void main(String[] args) {
        int[] arr = {0,2,3,1,0};

        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr) {

        int start= 0;
        int end = arr.length-1;
        
        while (start < end) {
            
            int mid = start + (end - start) / 2;
            boolean isAscending = arr[mid] < arr[mid + 1];
            if (isAscending) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }


}
