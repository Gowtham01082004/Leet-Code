class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      String[] S1_Array=s1.split(" ");
      String[] S2_Array=s2.split(" ");
      HashMap<String,Integer> map=new HashMap<>();
     for (int i = 0; i < S1_Array.length; i++) {
      map.put(S1_Array[i],map.getOrDefault(S1_Array[i],0)+1);
     }
     for (int i = 0; i < S2_Array.length; i++) {
      map.put(S2_Array[i],map.getOrDefault(S2_Array[i],0)+1);
     }
     ArrayList<String> ls = new ArrayList<>();
     for (Map.Entry<String, Integer> entry : map.entrySet()) {
         if (entry.getValue() == 1) {
             ls.add(entry.getKey());
         }
     }
      String ans[]=new String[ls.size()];
      for(int i=0;i<ls.size();i++){
        ans[i]=ls.get(i);
      }  
      return ans;  
    }
}