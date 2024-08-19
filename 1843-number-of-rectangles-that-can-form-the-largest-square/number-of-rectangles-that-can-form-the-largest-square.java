class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int ans[]=new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            int min=rectangles[i][0];
            for(int j=0;j<rectangles[i].length;j++){
                 if(min>rectangles[i][j]){
                    min=rectangles[i][j];
                 }
            }
            ans[i]=min;
        }
        int count=0;
        Arrays.sort(ans);
        int t=ans[ans.length-1];
        for(int i=0;i<ans.length;i++){
            if(ans[i]==t){
                count++;
            }
        }
        return count;
    }
}