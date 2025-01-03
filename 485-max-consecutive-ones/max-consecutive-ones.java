class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                cur++;
            }
            if(nums[i]==0){
                max=Math.max(cur,max);
                cur=0;
            }
        }
        return Math.max(cur,max);
    }
}