class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ls = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return ls;
        }

        int row_start = 0;
        int col_start = 0;
        int row_end = matrix.length - 1;
        int col_end = matrix[0].length - 1;

        while (row_start <= row_end && col_start <= col_end) {
            // right
            for (int col = col_start; col <= col_end; col++) {
                ls.add(matrix[row_start][col]);
            }
            row_start++;

            // down
            for (int row = row_start; row <= row_end; row++) {
                ls.add(matrix[row][col_end]);
            }
            col_end--;

            // left
            if (row_start <= row_end) {
                for (int col = col_end; col >= col_start; col--) {
                    ls.add(matrix[row_end][col]);
                }
                row_end--;
            }

            // up
            if (col_start <= col_end) {
                for (int row = row_end; row >= row_start; row--) {
                    ls.add(matrix[row][col_start]);
                }
                col_start++;
            }
        }

        return ls;
    }
}
