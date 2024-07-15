class Solution {
    public int addDigits(int num) {
        int ans = 0;
        while (num > 0) {
            int res = num % 10;
            ans = ans + res;
            num = num / 10;
        }
        if (ans < 10) {
            return ans;
        } else {
            return addDigits(ans);
        } 
    }
}