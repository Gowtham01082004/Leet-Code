class Solution {
       public int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(iseven(nums[i])){
                count++;
            }

        }
        return count;
        
    }
    private  boolean iseven(int i) {
        int count=0;
        while(i!=0){
            count++;
            i=i/10;

        }
        if(count%2==0) return true;
        else  return false;
    }
}