package leetCode;

public class _744 {

    // Find the smallest letter greater than the target in the array
    public static void main(String[] args) {
        char[] letters = {'a','c', 'f', 'j'};
        char target = 'c';

        System.out.println(findChar(letters, target));
    }

    static char findChar(char[] letters, char target) {

        int start = 0;
        int end = letters.length;

        if (target < letters[0]) {
            return letters[0];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] == target) {
                return letters[mid+1];
            }

            if (letters[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return letters[start];
    }
    
}
