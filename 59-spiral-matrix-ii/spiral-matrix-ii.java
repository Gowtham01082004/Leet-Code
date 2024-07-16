class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
        

        int row_start = 0;
        int col_start = 0;
        int row_end = n - 1;
        int col_end = n - 1;
        int count=1;

        while (row_start <= row_end && col_start <= col_end) {
            // right
            for (int col = col_start; col <= col_end; col++) {
                ans[row_start][col]=count++;
            }
            row_start++;

            // down
            for (int row = row_start; row <= row_end; row++) {
                ans[row][col_end]=count++;
            }
            col_end--;

            // left
            if (row_start <= row_end) {
                for (int col = col_end; col >= col_start; col--) {
                    ans[row_end][col]=count++;
                }
                row_end--;
            }

            // up
            if (col_start <= col_end) {
                for (int row = row_end; row >= row_start; row--) {
                    ans[row][col_start]=count++;
                }
                col_start++;
            }
        }
        return ans;


    }
}