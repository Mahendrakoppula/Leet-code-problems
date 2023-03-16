class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
    Set<Character> usedChars = new HashSet<>();
    
    for (int i = 0; i < s.length(); i++) {
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);
        
        if (mapping.containsKey(sChar)) {
            if (mapping.get(sChar) != tChar) {
                return false;
            }
        } else {
            if (usedChars.contains(tChar)) {
                return false;
            }
            mapping.put(sChar, tChar);
            usedChars.add(tChar);
        }
    }
    
    return true;
    }
}