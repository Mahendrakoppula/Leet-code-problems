class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        
        HashMap<Character,Integer> mp= new HashMap<>();
        
        for(int i=0;i<t.length();i++){
            char c= s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            
            if(!mp.containsKey(c) || mp.get(c)<=0){
                return false;
            }
            else{
                mp.put(c,mp.getOrDefault(c,0)-1);
            }
        }
        return true;
        
        
        
        
//          Stack<Character>st= new Stack<>();
        
//         int[] freq = new int[26];
//     for (char c : magazine.toCharArray()) {
//         freq[c - 'a']++;
//     }

//     for (char c : ransomNote.toCharArray()) {
//         if (freq[c - 'a'] > 0) {
//             freq[c - 'a']--;
//             if (!st.contains(c)) {
//                 st.push(c);
//             }
//         } else {
//             return false;
//         }
//     }

//     return true;
    }
}