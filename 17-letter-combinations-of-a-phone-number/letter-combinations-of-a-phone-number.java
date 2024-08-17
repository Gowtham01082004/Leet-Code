class Solution {
    String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ls=new ArrayList<>();
        if(digits.length() == 0){
            return ls;
        }
        combo(digits,ls,"",0);
        return ls;
    }
    public void combo(String digits,List<String> ls,String str,int i){
        if(str.length() == digits.length()){
            ls.add(str);
            return;
        }
        int n = Character.getNumericValue(digits.charAt(i));
        if (n < 0 || n > 9) {
            return;
        }
        for(int j=0;j<arr[n].length();j++){
            combo(digits,ls,str+arr[n].charAt(j),i+1);
        }

    }
}