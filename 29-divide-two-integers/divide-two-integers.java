class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
         }
        long res=dividend/divisor;
        return (int) res;
    }
}