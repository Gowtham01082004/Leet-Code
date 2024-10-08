class Solution {
    public int maxVowels(String s, int k) {
                int l=0;
        int r=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            if(helper(s.charAt(i))){
                sum++;
            }
        }
        int maxsum=sum;
        while(r<s.length()-1){
           if(helper(s.charAt(l))){
            sum=sum-1;
           }
           l++;
           r++;
           if(helper(s.charAt(r))){
            sum=sum+1;
           }
           maxsum=Math.max(maxsum,sum);

        }
        return maxsum;
    }
    private  boolean helper(char c) {
        return c=='a'||c=='i'||c=='o'||c=='e'||c=='u';
    }
}