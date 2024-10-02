class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ans[] = new int [arr.length];
        int temp[] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int n: temp){
            if(!map.containsKey(n)){
                map.put(n,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}