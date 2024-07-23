class Solution {
    public String[] sortPeople(String[] names, int[] nums) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], names[i]);
        }
        String ans[]=new String[nums.length];
        Arrays.sort(nums);
        int index=0;
        for(int i=nums.length-1;i>=0;i--){
            ans[index]=map.get(nums[i]);
            index++;


        }
        return ans;  
    }
}