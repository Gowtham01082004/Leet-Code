class Solution {
    public int maxProfit(int[] prices) {
         if (prices.length == 1) return 0;
        int buy=prices[0];
        int profit=0;
        for(int i:prices)
        if(buy>i){
        buy=i;
        }else if(buy<i){
            profit+=i-buy;
            buy=i;
        }

        return profit;
    }
}