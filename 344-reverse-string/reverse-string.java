class Solution {
    public void reverseString(char[] s) {
        Str(s,0,s.length-1);
    }
    public void Str(char[] s,int start,int end){
        if(start>=end){
           return;
        }
        char temp =s[start];
        s[start]=s[end];
        s[end]=temp;
        Str(s,start+1,end-1);
    }
}