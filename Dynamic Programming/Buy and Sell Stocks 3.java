class Solution {
    public int maxProfit(int[] prices) {
        // List<Integer> profit=new ArrayList<Integer>();
        // for(int i=1;i<prices.length;i++){
        //     if(prices[i]>prices[i-1]){
        //         profit.add(prices[i]-prices[i-1]);
        //     }
        // }
        // int min=prices[0],pro=0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]>min){
        //         pro=Math.max(pro,prices[i]-min);
        //     }
        //     else{
        //         min=prices[i];
        //     }
        // }
        // int max1=0,max2=0;
        // Collections.sort(profit);
        // if(!profit.isEmpty() && profit.size()>1){
        //     max1=profit.get(profit.size()-1);
        //     max2=profit.get(profit.size()-2);
        // }
        // if(pro>max1+max2){
        //     return pro;
        // }
        // return max1+max2;
int buy1 = Integer.MIN_VALUE, sell1 = 0;
int buy2 = Integer.MIN_VALUE, sell2 = 0;

for (int price : prices) {
    buy1 = Math.max(buy1, -price);
    sell1 = Math.max(sell1, buy1 + price);
    buy2 = Math.max(buy2, sell1 - price);
    sell2 = Math.max(sell2, buy2 + price);
}
return sell2;
    }
}
