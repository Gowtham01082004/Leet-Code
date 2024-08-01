class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> ls1=new HashSet<>();
        HashSet<Integer> ls2=new HashSet<>();
        for(int value:nums1){
            ls1.add(value);
        }
        for(int value:nums2){
            ls2.add(value);
        }
         HashSet<Integer> ans1=new HashSet<>();
        HashSet<Integer> ans2=new HashSet<>();
        for(int value:nums1){
            if(ls2.contains(value)==false)

          ans1.add(value);
            
        }
        for(int value:nums2){
            if(ls1.contains(value)==false)
               
         ans2.add(value);
            
        }

        return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));

        
    }
}