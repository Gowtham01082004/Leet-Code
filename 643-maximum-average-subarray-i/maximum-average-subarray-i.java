class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int l=0;
     int r=k-1;
     int n=nums.length;
     double sum=0;
     for(int i=0;i<=r;i++)sum+=nums[i];
     double maxsum=sum;
     while(r<n-1){
        sum=sum-nums[l]+nums[++r];
        l++;
        maxsum=Math.max(maxsum,sum);

     }   
     return maxsum/k;
    }
}