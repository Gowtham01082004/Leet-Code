class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int sumgas=0;
      for(int n:gas){
        sumgas+=n;
      }  
      int costgas=0;
      for(int n:cost){
        costgas+=n;
      }
      if(costgas>sumgas){
        return -1;
      }

        int csum=0;
        int ci=0;
        for(int i=0;i<gas.length;i++){
            csum+=gas[i]-cost[i];
            if(csum<0){
                csum=0;
                ci=i+1;
            }
        }
        return ci;
    }
}