class Solution {
    public int maxProfit(int[] prices) {
    //     int profit = 0;
    // for (int i = 0; i < prices.length; i++) {
    //     for (int j = i; j >= 0; j--) {
    //         profit = Math.max(profit, prices[i]-prices[j]);
    //     }
    // }
    // return profit;
        
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}