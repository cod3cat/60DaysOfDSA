import java.util.Arrays;

/* Search for an integer in a array where rows and columns are sorted individually and it's n x m matrix*/

public class SearchInNxMMatrics {
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3,4}, {5,7,8,9}, {10,13},{18, 20 ,22 ,26, 29, 44}};
        int[][] arr = {{10, 20, 30, 40}, {15,25,45}, {28,29,38,48}, {33, 34, 39, 50, 52,57}};
        int target = 52;

        System.out.println(Arrays.toString(find(arr, target)));
    }

    private static int[] find(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            int col = arr[row].length - 1;

            while(col >= 0) {
            
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }

                if (arr[row][col] < target) {
                    break;
                } else {
                    col--;
                }
            }
        }

        return new int[] {-1, -1};
    }
}
