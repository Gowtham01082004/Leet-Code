class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(helper(i)) ls.add(i);
        }
        return ls;
    }
    public boolean helper(int n){
        int temp=n;
        while(temp!=0){
            int l=temp%10;
            if(l==0||n%l!=0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
}