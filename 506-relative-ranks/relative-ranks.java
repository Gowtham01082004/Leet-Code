class Solution {
    public String[] findRelativeRanks(int[] score) {
         String[] res=new String[score.length];
    for (int i = 0; i < res.length; i++) res[i]=String.valueOf(score[i]);
    Arrays.sort(score);
    HashMap<Integer,Integer> map=new HashMap<>();
    int index=1;
    for (int i =score.length-1; i >=0; i--) map.put(score[i],index++);
     for (int i = 0; i < res.length; i++) {
      int num=Integer.parseInt(res[i]);
      String s=String.valueOf(map.get(num));
      if(s.equals("1")) res[i]="Gold Medal";
      else if(s.equals("2")) res[i]="Silver Medal";
      else if(s.equals("3")) res[i]="Bronze Medal";
      else res[i]=s;

     }
    return res;
    
    }
}