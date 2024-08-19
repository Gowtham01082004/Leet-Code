class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String result = "";
        int count = 0;

        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);

            if (c == '-') {
                continue;
            }

            if (!Character.isDigit(c) && c > 90) {
                c -= 32;
            }

            if (count == k) {
                result = '-' + result;
                count = 0;
            }

            result = c + result;
            count++;
        }

        return result;
    }
}
