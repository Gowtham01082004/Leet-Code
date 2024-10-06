class Solution {
    public int divisorSubstrings(int num, int k) {
              String nums=String.valueOf(num);
        int count=0;
        int l=0;
        int r=k-1;
        while(r<nums.length()){
          int a=Integer.parseInt(nums.substring(l,r+1));
          if(a!=0){
            if(helper(a,num)){
                count++;
            }
          }
          l++;
          r++;
        }
        
        return count;
    }
    public boolean helper(int n,int numner){
        return numner%n==0;
    }
}