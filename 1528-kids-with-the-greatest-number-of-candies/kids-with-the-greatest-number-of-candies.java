class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > maxCandies){
                maxCandies=candies[i];
            }
        }
        ArrayList<Boolean> ls=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            ls.add(candies[i]+extraCandies >=maxCandies);
        }
        return ls;
    }
}