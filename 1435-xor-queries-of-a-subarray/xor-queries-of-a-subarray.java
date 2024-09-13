class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] num = new int[2];
        for (int i = 0; i < queries.length; i++) {
            helper(arr, queries, num, i);
            ans[i] = helperToGetXor(arr, num);
        }
        return ans;
    }

    public static void helper(int[] arr, int[][] q, int[] num, int i) {
        num[0] = q[i][0];
        num[1] = q[i][1];
    }

    public static int helperToGetXor(int[] arr, int[] num) {
        int number = 0;
        for (int i = num[0]; i <= num[1]; i++) {
            number ^= arr[i];
        }
        return number;
    }
}
