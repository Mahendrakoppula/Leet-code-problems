class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length()||j<word2.length()){
           if(i<=word1.length()-1){
               ans.append(word1.charAt(i));
               i++;
           }
            if(j<=word2.length()-1){
               ans.append(word2.charAt(j));
               j++;
           }
        }
        return ans.toString();
    }
}