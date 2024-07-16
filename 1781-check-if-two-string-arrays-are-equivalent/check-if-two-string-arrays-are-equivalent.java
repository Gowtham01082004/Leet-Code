class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordx="";
        String wordy="";
        for (int i = 0; i < word1.length; i++) {
            wordx=wordx+word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            wordy=wordy+word2[i];
        }
        
        return wordx.equals(wordy);
    }
}