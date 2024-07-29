class Solution {
    public int hIndex(int[] citations) {
        int maxh=0;
        int h=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<h;i++){
            if(citations[i]>=h-i){
                maxh=Math.max(h-i,maxh);
            }
        }
        return maxh;

        
    }
}