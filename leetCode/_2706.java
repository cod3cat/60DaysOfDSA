package leetCode;

public class _2706 {
    public static void main(String[] args) {

        System.out.println(buyChoco(new int[] {69,91,78,19,40,13}, 94));
        
    }

    static int buyChoco(int[] prices, int money) {
    //     int remaining = Integer.MIN_VALUE;
    //     int arrLen = prices.length;

    //     for (int i = 0; i < arrLen -1; i++) {
    //         for (int j = i+1; j < arrLen; j++) {
    //             int temp = prices[i] + prices [j];
    //             int temp1 = Math.abs(money - temp);
    //             if ( temp <= money && temp1 > remaining) {
    //                 remaining = temp1;
    //             }
    //         }
    //     }

    //     return remaining < 0 ? money : remaining;
    // }

    int minCost = Integer.MAX_VALUE;
        int arrLen = prices.length;

        for (int i = 0; i < arrLen - 1; i++) {
            for (int j = i+1; j < arrLen; j++) {
                int currCost = prices[i] + prices [j];
                if (currCost < minCost) {
                    minCost = currCost;
                }
            }
        }

        return minCost <= money  ? money - minCost : money;
    }
}
