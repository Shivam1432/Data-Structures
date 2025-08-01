class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int profit=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>min){
                profit=Math.max(profit,prices[i]-min);
            }
            else{
                min=prices[i];
            }
        }
        return profit;
    }
}
