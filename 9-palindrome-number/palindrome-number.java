class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int t = x;
        while(t>0){
            int ld = t%10;
            rev=(rev*10)+ld;
            t=t/10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}