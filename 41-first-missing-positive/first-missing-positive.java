class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=0;
        while(n<nums.length){
            if(nums[n]>0&&nums[n]<nums.length&&nums[n]!=nums[nums[n]-1]){
                swap(nums,n,nums[n]-1);
            }
            else{
                n++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}