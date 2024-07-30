class Solution {
    public int singleNumber(int[] nums) {
        int bitcount[]=new int[32];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<32;j++){
                if((nums[i]&(1<< j))!=0){
                    bitcount[j]++;
                }
            }
        }
        int result=0;
        for(int i=0;i<32;i++){
            if(bitcount[i]%3!=0){
                result=result|(1<<i);
            }
        }
        return result;

    }
}