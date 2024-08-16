class Solution {
    public int findFinalValue(int[] nums, int original) {
        if(!found(nums,original)){
            return original;
        }
        return findFinalValue(nums,original*2);
    }
    public boolean found(int nums[],int n){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                return true;
            }
        }
        return false;
    }
}