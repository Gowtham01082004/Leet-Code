class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int sell=prices[0];
        for(int num:prices){
            int buy=num-sell;
           profit= Math.max(profit,buy);
           sell= Math.min(sell,num);
        }
        return profit;
    }
}