package leetCode;

public class _1295 {
    /*
     * 1295. Find Numbers with Even Number of Digis
     * 
     * Example 1:
        Input: nums = [12,345,2,6,7896]
        Output: 2
    */
    
    
    public static void main(String[] args) {
       int[] nums =   {12,345,2,6,7896};

       System.out.println(findEven(nums));

    }
    
    static int findEven(int[] lArray) {
        int count = 0;

        for (int i : lArray) {
            if (String.valueOf(i).length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}

/* learning:
    you can find the number of digits in the number by using log10
    for eg: log10(100) = 2
            so number of digits = 2 + 1 which is 3
            Similarly:
                log10(321) ~= 2 and 2 + 1 = 3 (digits) */
