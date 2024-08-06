class Solution {
    public boolean canAliceWin(int[] nums) {
       int ssum=0;
       int dsum=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>9){
            dsum=dsum+nums[i];
        }
        else{
            ssum=ssum+nums[i];
        }
       }
      return ssum!=dsum;
    }
}