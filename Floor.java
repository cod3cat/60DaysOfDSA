public class Floor {
    public static void main(String[] args) {
        // int arr[] = {2,3,5,9,14,16,18};
        // int target = 4;
        int[] arr = {1,3,5,10};
        int target = 6;
        System.out.println(findFloor(arr, target));
    }

    static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr[end];

        while (start < end) {

            int mid = start + (end - start) / 2;

            // if (target == arr[mid]) {
            //     return mid;}

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }

        return start;
    }

}
