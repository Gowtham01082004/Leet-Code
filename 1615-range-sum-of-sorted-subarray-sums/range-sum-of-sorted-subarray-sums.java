import java.util.ArrayList;
import java.util.Collections;

class Solution {
    private static final int MOD = 1_000_000_007;
    
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> subarraySums = new ArrayList<>();
        
        // Calculate all subarray sums
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                subarraySums.add(currentSum);
            }
        }
        
        // Sort the subarray sums
        Collections.sort(subarraySums);
        
        // Calculate the sum of the elements from index left to right
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarraySums.get(i)) % MOD;
        }
        
        return (int) result;
    }
}
