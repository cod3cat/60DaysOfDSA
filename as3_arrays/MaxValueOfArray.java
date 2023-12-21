package as3_arrays;

public class MaxValueOfArray {
    public static void main(String[] args) {
        int[] arr = {1,13,2,55,18};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.printf("Maximum value is %d", max);

    }
}
