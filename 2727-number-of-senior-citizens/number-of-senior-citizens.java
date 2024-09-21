class Solution {
    public int countSeniors(String[] details) {
        ArrayList<Integer> ls=new ArrayList<>();
       for(int i=0;i<details.length;i++){
            int num1=details[i].charAt(11)-'0';
            int num2=details[i].charAt(12)-'0';
            int ans=num1*10+num2;
            if(ans>60){
                ls.add(ans);
            }  
        }
        return ls.size();
    }
}