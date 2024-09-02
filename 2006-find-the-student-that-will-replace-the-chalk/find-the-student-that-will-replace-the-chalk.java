class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long tsum=0;
        for(int num:chalk)
        {
            tsum+=num;
        }
        int rem=(int)(k%tsum);
        for(int i=0;i<chalk.length;i++){
            if(rem<chalk[i]){
                return i;
            }
            rem-=chalk[i];
        }
        return rem;
    }
}