class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++){
            ans[i]=i+1;
            sum=sum+ans[i];
        }
        ans[n-1]=sum*-1;
        return ans;
    }
}