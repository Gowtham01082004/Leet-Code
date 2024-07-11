class Solution {
    public int fib(int n) {
        int first=0;
        int second=1;
        int ans=0;
        for(int i=0;i<=n;i++){
            int next=first+second;
            if(i==n){
                ans =first;
            }
            first=second;
            second=next;
        }
        return ans;

    }
}