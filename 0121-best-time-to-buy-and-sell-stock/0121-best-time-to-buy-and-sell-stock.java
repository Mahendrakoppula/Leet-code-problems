class Solution {
    public int maxProfit(int[] prices) {
    //     int profit = 0;
    // for (int i = 0; i < prices.length; i++) {
    //     for (int j = i; j >= 0; j--) {
    //         profit = Math.max(profit, prices[i]-prices[j]);
    //     }
    // }
    // return profit;
        
//         int lsf = Integer.MAX_VALUE;
//         int op = 0;
//         int pist = 0;
        
//         for(int i = 0; i < prices.length; i++){
//             if(prices[i] < lsf){
//                 lsf = prices[i];
//             }
//             pist = prices[i] - lsf;
//             if(op < pist){
//                 op = pist;
//             }
//         }
//         return op;
         int minPrice = Integer.MAX_VALUE;  // initialize minimum price to a large value
    int maxProfit = 0;                 // initialize maximum profit to 0
    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        } else {
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
    }
    return maxProfit;
    }
}