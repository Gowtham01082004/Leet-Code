class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length]; // Correctly initialize the target array

        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            int num = nums[i];

            // Shift elements to the right to make space for the new element
            for (int j = nums.length - 1; j > idx; j--) {
                ans[j] = ans[j - 1];
            }

            // Insert the new element at the specified index
            ans[idx] = num;
        }

        return ans;
    }
}