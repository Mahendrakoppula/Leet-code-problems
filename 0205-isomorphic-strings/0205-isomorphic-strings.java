class Solution {
    public boolean isIsomorphic(String s, String t) {
//         Map<Character, Character> mapping = new HashMap<>();
//     Set<Character> usedChars = new HashSet<>();
    
//     for (int i = 0; i < s.length(); i++) {
//         char sChar = s.charAt(i);
//         char tChar = t.charAt(i);
        
//         if (mapping.containsKey(sChar)) {
//             if (mapping.get(sChar) != tChar) {
//                 return false;
//             }
//         } else {
//             if (usedChars.contains(tChar)) {
//                 return false;
//             }
//             mapping.put(sChar, tChar);
//             usedChars.add(tChar);
//         }
//     }
    
//     return true;
        
         if (s == null || t == null || s.length() != t.length()) {
        return false;
    }
    
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
        if (map.containsKey(c1)) {
            if (map.get(c1) != c2) {
                return false;
            }
        } else {
            if (map.containsValue(c2)) {
                return false;
            }
            map.put(c1, c2);
        }
    }
    
    return true;
    }
}