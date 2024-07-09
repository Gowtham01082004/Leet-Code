import java.util.Arrays;

class Solution {
      public  int [] merge(int[] nums,int m, int[] nums1,int n) {
       // int count=0;
        for (int j = 0, i = m; j < n; j++) {
            nums[i] = nums1[j];
            i++;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                
            }
        }
       return nums;
    }
}
