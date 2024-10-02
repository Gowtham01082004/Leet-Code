class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        helper(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    public void helper(int i,int nums[],int target,List<List<Integer>> ans,List<Integer> ot){
        if(i==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(ot));
            }
            return;
        }
        if(nums[i] <=target){
            ot.add(nums[i]);
            helper(i,nums,target-nums[i],ans,ot);
            ot.remove(ot.size()-1);
        }
        helper(i+1,nums,target,ans,ot);
    }
}