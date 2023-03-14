class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Stack<Character>st= new Stack<>();
        
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        
       // for(int i=0;i<ransomNote.length();i++){
       //     for(int j=0;j<magazine.length();j++){
       //         char c=ransomNote.charAt(i);
       //         char d=magazine.charAt(j);
       //         if(c==d){
       //             st.push(c);
       //         }
       //     }
       // }
       //  if(ransomNote.length()==st.size()){
       //      return true;
       //  }
       //  return false;
        int[] freq = new int[26];
    for (char c : magazine.toCharArray()) {
        freq[c - 'a']++;
    }

    for (char c : ransomNote.toCharArray()) {
        if (freq[c - 'a'] > 0) {
            freq[c - 'a']--;
            if (!st.contains(c)) {
                st.push(c);
            }
        } else {
            return false;
        }
    }

    return true;
  }
}