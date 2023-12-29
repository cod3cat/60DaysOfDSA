public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 4;
        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid;
                } else {
                    start = mid - 1;
                }
            }
        }

        return start;
    }
}
