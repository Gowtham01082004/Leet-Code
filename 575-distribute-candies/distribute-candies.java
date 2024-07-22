class Solution {
    public int distributeCandies(int[] candyType) {
        if(candyType.length==0){
            return 0;
        }
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
       if(set.size()==candyType.length/2){
        max=candyType.length/2;
       }
       if(set.size()>candyType.length/2){
        max=candyType.length/2;
       }
        if(set.size()<candyType.length/2){
        max=set.size();
       }
       return max;


    }
}