class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num: arr){
            int rem=(num % k + k) % k;
            int want=(k - rem) % k;
            if(map.getOrDefault(want,0)>0){
                count++;
                map.put(want,map.get(want)-1);
            }
            else{
                map.put(rem,map.getOrDefault(rem,0)+1);
            }
        }
        return count==(arr.length/2);
    }
}