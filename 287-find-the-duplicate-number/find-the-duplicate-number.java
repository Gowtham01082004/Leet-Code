class Solution {
    public int findDuplicate(int[] nums) {

        
        int x= 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                x=nums[i];
            }
            set.add(nums[i]);
        }
        return x;


        
    }
}