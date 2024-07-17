class Solution {
    public boolean isPalindrome(String s) {
       	StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()){
			if(Character.isLetterOrDigit(c)){
				sb.append(Character.toLowerCase(c));
			}

		}
		String ans=sb.toString();
		String rev=sb.reverse().toString();
		return ans.equals(rev);
		
        
    }
}