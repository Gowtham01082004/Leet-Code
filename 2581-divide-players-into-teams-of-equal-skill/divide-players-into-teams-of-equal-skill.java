class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start=0;
        int end=skill.length-1;
        long ans=0;
        long mul=skill[start]+skill[end];
        while(start<end){
            long dif=skill[start]+skill[end];
            ans+=skill[start]*skill[end];
           start++;
           end--;
            if(mul!=dif){
                return -1;
            }
        }
        return ans;
    }
}