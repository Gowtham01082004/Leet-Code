class Solution {
    public char findKthBit(int n, int k) {
        // Base case: when n is 1, the string is "0"
        if (n == 1) {
            return '0';
        }
        
        String first = "0";
        String second = "";
        
        // Generate the Sn sequence iteratively
        for (int i = 2; i <= n; i++) {  // Start from 2 since S1 is "0"
            second = first + "1" + reverse(invert(first));  // Build the sequence
            first = second;  // Update first for next iteration
        }
        
        // Return the kth bit from the generated string
        return second.charAt(k - 1);  
    }

    // Function to reverse a string
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);  
        return sb.reverse().toString();
    }

    // Function to invert the string (change '0' -> '1' and '1' -> '0')
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
