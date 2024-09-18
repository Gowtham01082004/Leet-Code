class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
     ArrayList<Integer> ls=new ArrayList<>();
     for(int i=0;i<height.length-1;i++){
        if(height[i]>threshold) ls.add(i+1);
     }
     return ls;
    }
}