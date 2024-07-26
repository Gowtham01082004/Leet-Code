class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ans=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        Arrays.sort(nums2);
         for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                ans=nums2[i];
                break;
            }
        }
        return ans;

        
    }
}