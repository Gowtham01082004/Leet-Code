import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int n = grid.length;
        int repeated = 0, missing = 0;

        // Check from 1 to n*n
        for (int i = 1; i <= n * n; i++) {
            int freq = map.getOrDefault(i, 0);
            if (freq == 2) {
                repeated = i;
            } else if (freq == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
