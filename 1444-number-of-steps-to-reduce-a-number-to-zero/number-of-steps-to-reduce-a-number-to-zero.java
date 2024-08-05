class Solution {
    public int numberOfSteps(int num) {
        return counter(num,0);
    }
    public int counter(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return counter(num/2,count+1);
        }
        return counter(num-1,count+1);
    }
}