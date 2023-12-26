public class BinarySearch {

    //Assuming array is sorted in incremental order
    //Return the index of the element if found
    public static void main(String[] args) {

        int[] arr = {1,5,9,13,15,25,45};
        System.out.println(findElement(arr, 2));
    }

    static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid = 0;

        if (target > arr[end] || target < arr[start]) {
                return -1;
            }

        while (start <= end) {
            
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }  
        }

        return -1;
    }
}
