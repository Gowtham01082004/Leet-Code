class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;
        if((rows*cols)!=(r*c)) return mat;
        int ans[][]=new int[r][c];
        int ansr=0;
        int ansc=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ans[ansr][ansc]=mat[i][j];
                ansc++;
                if(ansc==c){
                    ansc=0;
                    ansr++;
                }

            }
        }
        return ans;
    }
}