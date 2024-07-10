class Solution {
    public String restoreString(String s, int[] arr) {
        char[] result=new char[arr.length];
        for(int i=0;i<result.length;i++){
            result[arr[i]]=s.charAt(i);
        }
        String s1=new String(result);
        return s1;

    }
}