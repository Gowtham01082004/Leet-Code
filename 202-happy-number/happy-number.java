class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        int ans = 0;

       
        if (n == 1) {
            return true;
        } else if (n == 4) {
            return false; 
        }

       
        while (temp != 0) {
            int happy = temp % 10;
            ans += happy * happy;
            temp /= 10;
        }

        
        return isHappy(ans);

    }
    
}