class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // 1. using pointer
        // int i =0;
        // int j=1;
        // int n = prices.length;
        // while(j<n){
        //     if(prices[j]<prices[i]){
        //         i = j;
        //     } else {
        //         maxProfit = Math.max(prices[j]-prices[i],maxProfit);
        //     }
        //     j++;
        // }
        // return maxProfit;

        // 2. 
        int minBuy = prices[0];

        for(int sell:prices){
            maxProfit = Math.max(sell-minBuy,maxProfit);
            minBuy = Math.min(minBuy,sell);
        }

        return maxProfit;
    }
}
