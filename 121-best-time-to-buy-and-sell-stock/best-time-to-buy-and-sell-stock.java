class Solution {
    public int maxProfit(int[] nums) {
        int maxp=0;
		int minv=nums[0];
		for (int i = 1; i < nums.length; i++) {
			int buy=nums[i]-minv;
			if(buy>maxp){
				maxp=buy;
			}
			if(minv>nums[i]){
				minv=nums[i];
			}
			
		}
        return maxp;
    }
}