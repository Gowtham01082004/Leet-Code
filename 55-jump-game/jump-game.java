class Solution {
    public boolean canJump(int[] nums) {
        int maxPossible=0;

        for(int i=0;i<nums.length;i++){
            if(maxPossible<i) return false;
            maxPossible=Math.max(i+nums[i],maxPossible);
        }
        return true;
    }
}