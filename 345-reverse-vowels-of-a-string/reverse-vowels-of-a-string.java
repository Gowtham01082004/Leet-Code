class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;

        for (i = 0, j = ch.length - 1; i < j; ) {
 
            if (!isVowel(ch[i])) {
                i++;
                continue;
            }

            if (!isVowel(ch[j])) {
                j--;
                continue;
            }

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
           
            i++;
            j--;
        }

        return new String(ch);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
