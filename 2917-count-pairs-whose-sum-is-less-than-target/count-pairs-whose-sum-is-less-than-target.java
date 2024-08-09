import java.util.*;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();
        
        
        Collections.sort(nums);
        
        for (int i = 0; i < n; i++) {
            int cur = nums.get(i);
            int start = i + 1; // Start searching from the next index
            int end = n - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                
                if (cur + nums.get(mid) < target) {
                   
                    count += (mid - start + 1);
                    start = mid + 1; 
                } else {
                    end = mid - 1; 
                }
            }
        }
        
        return count;
    }
}
