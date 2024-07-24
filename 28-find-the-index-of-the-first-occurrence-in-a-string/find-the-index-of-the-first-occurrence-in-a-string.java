class Solution {
    public int strStr(String haystack, String needle) {
        int size1=haystack.length();
        int size2=needle.length();
        for(int i=0;i<=size1-size2;i++){
            if(haystack.substring(i,i+size2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}