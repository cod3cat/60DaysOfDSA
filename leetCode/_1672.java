package leetCode;

public class _1672 {
    public static void main(String[] args) {
        // 1672. Richest Customer Wealth

        /* You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

            A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth. */
    
        int[][] accounts = {{1,2,3},{4,2,1}};

        System.out.println(maxWealth(accounts));
    
        }

        static int maxWealth(int[][] arr) {
            int maxValue = 0;
            
            /* Since array length is fixed m x n, we can use just one variable as max length
             * Should use for loop instead of for each for better memory. So the final code would look like
             * 
                int maxValue = 0;
                int arrLength = arr.length;
                for (int i = 0; i < arrLength; i++) {
                    int sum = 0;
                    for (int j = 0; j < arrLength; j++) {
                        sum += arr[i][j];
                    }
                    //Math.max takes less memory than the if condition
                    maxValue = Math.max(maxValue, sum);
                }

             */    


            for (int[] is : arr) {
                int sum = 0;
                for (int is2 : is) {
                    sum += is2;
                }

                if (sum > maxValue) {
                    maxValue = sum;
                }

            }

            return maxValue;
        }
}
