class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxn=0;
       
        int count=0;
        for(int i=0;i<rectangles.length;i++){
           int min=Math.min(rectangles[i][0],rectangles[i][1]);
            if(min > maxn){
                maxn=min;
                count=1;
            }
            else  if(min==maxn){
                count++;
            }
        }
        return count;
    }
}