class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder numericRepresentation = new StringBuilder();
        for (char c : s.toCharArray()) {
            numericRepresentation.append(c - 'a' + 1);
        }

        
        String current = numericRepresentation.toString();
        for (int i = 0; i < k; i++) {
            current = sumOfDigits(current);
        }

       
        return Integer.parseInt(current);
    }

    private String sumOfDigits(String numStr) {
        int sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += c - '0';
        }
        return String.valueOf(sum);
    }
}
