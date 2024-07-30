class Solution {
    public int singleNumber(int[] nums) {
       
    int ones = 0, twos = 0, threes = 0;
    
    for (int i = 0; i < nums.length; i++) {
      int num=nums[i];
       twos |= ones & num;
       ones ^= num;
       threes = ones & twos;
       ones &= ~threes;
       twos &= ~threes;
    }
    return ones;
    
  }
    
}