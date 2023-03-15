class Solution {
    public boolean isAnagram(String ransomNote, String magazine) {
        
        if(ransomNote.length()!=magazine.length()){
            return false;
        }
        
        
//          HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
//         // Count the frequency of characters in magazine
//         for (int i = 0; i < magazine.length(); i++) {
//             char c = magazine.charAt(i);
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
        
//         // Check if we can construct ransomNote using magazine
//         for (int i = 0; i < ransomNote.length(); i++) {
//             char c = ransomNote.charAt(i);
//             if (!map.containsKey(c) || map.get(c) <= 0) {
//                 return false;
//             }
//             map.put(c, map.get(c) - 1);
//         }
        
//         return true;
        
         Stack<Character>st= new Stack<>();
        
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