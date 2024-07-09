class Solution {
    public String defangIPaddr(String address) {
        //String s="1.1.1.1";
		String[] word=address.split("");
		//System.out.println(Arrays.toString(word));
		String ans="";
		for (int i = 0; i < word.length; i++) {
			String ch=word[i];
			if(ch.equals(".")){
				ans=ans+"[.]";
			}
			else{
				ans=ans+ch;
			}
			
		}
		 return ans;
        
    }
}