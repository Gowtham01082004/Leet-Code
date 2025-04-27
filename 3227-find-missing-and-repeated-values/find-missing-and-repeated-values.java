class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int n=grid[i][j];
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        int m=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            list.add(entry.getKey());
            if(entry.getValue()>1){
                 m=entry.getKey();
            }
        }
        int count =1;
        Collections.sort(list);
        int o=0;
        for(int i=0;i<list.size();i++){
          if(list.get(i)==count){
            count++;
          }else{
            break;
          }
        }
        if(count==list.size()){
            o=count+1;
        }else{
            o=count;
        }

        
        int ans[]=new int[2];
        ans[0]=m;
        ans[1]=count;
        return ans;
    }
}