class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String ans="";
        for(int i=str.length-1;i>=0;i--){
            String w=str[i];
            if(ans == ""){
                ans=w;
            }
            else{
                ans=ans+" "+w;
            }
        }
        return ans;

        
    }
}