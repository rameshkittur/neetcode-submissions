class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i =0;
        int j=1;
        int n = prices.length;
        while(j<n){
            if(prices[j]<prices[i]){
                i = j;
            } else {
                maxProfit = Math.max(prices[j]-prices[i],maxProfit);
            }
            j++;
        }
        return maxProfit;
    }
}
