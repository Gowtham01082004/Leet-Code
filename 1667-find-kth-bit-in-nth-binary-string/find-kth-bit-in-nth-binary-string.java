class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        
        String first = "0";
        String second = "";
        for (int i = 2; i <= n; i++) {  
            second = first + "1" + reverse(invert(first));  
            first = second;  
        }
        return second.charAt(k - 1);  
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);  
        return sb.reverse().toString();
    }
    public String invert(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
