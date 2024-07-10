class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int res[]=new int[2];
         for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(map.containsKey(c) && map.get(c)!=i){
                res[0]=i;
                res[1]=map.get(c);

            }
        }
        return res;
        
    }
}