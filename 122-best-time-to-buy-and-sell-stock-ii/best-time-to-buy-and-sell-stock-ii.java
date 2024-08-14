class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int buyprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buyprice <prices[i]){
                maxp=maxp+prices[i]-buyprice;
            }
           buyprice=prices[i];
        }
        return maxp;
    }
}