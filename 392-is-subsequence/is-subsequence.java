class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int sl=s.length();
        int tl=t.length();
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        if(sl<1){
            return true;
        }
        while(i<tl){
            if(ch2[i]==ch1[j]){
                j++;
            }
            i++;
            if(j==sl){
                return true;
            }
        }
        return false;
    }
}