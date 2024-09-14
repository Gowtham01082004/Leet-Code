class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0 ;
        for ( int i : nums) max = Math.max(i,max) ;
        int length=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                count++;
                length = Math.max(length,count);
            }else{
                count = 0;
            }
        }
        return length;

    }
}