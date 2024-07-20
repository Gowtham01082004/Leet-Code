class Solution {
    public int findDuplicate(int[] nums) {

        boolean[] arr = new boolean[nums.length-1];
        int x= 0;


        for(int i = 0; i < nums.length;i++){
            if(arr[nums[i] -1]){
                x = nums[i];
                break;
            }
            else{
                arr[nums[i]-1] = true ;
            }
        }

        return x;
        
    }
}