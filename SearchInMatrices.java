import java.util.Arrays;

public class SearchInMatrices {
    
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15,25,35,45}, {28,29,38,48}, {33, 34, 39, 50}};
        int target = 38;
        
        System.out.println(Arrays.toString(find(arr, target)));
    }

    private static int[] find(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length - 1 && col > 0) {
                if (arr[row][col] == target) {
                return new int[] {row, col};
            }

            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[] {-1, -1};
    }
}