class Solution {
    public boolean canConstruct(String s1, String s2) {
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();


        HashMap<Character,Integer> map=new HashMap<>();
        for( char ch:b){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         for (char ch : a) {
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    map.put(ch, map.get(ch) - 1);
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        }
        
        return true;
    }
}