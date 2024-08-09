class Solution {
    public double minimumAverage(int[] nums) {
        double ans[]=new double[nums.length/2];

        Arrays.sort(nums);
        
        int end=nums.length-1;
        for(int i=0;i<ans.length;i++){
            ans[i]=average(nums,i,end);
            end--;
        }
       
       
        
        double min=ans[0];
        for(int i=0;i<ans.length;i++){
            if(ans[i]<min){
                min=ans[i];
            }
        }
        return min;
    }
    public double average(int nums[],int start,int end){
          return  (double)(nums[start]+nums[end])/2;
    }
}