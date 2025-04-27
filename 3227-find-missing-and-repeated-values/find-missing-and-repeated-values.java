class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long sum = (long) N * (N + 1) / 2;
        long squareSum = (long) N * (N + 1) * (2 * N + 1) / 6;

        long sumGrid = 0, squareSumGrid = 0;

        for (int[] row : grid) {
            for (int num : row) {
                sumGrid += num;
                squareSumGrid += (long) num * num;
            }
        }

        long diff = sumGrid - sum; // a - b
        long squareDiff = squareSumGrid - squareSum; // a^2 - b^2

        long sum_ab = squareDiff / diff; // a + b

        int a = (int) ((diff + sum_ab) / 2);
        int b = (int) (sum_ab - a);

        return new int[]{a, b};
    }
}
