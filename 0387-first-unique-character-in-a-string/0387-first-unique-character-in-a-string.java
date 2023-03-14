class Solution {
    public int firstUniqChar(String s) {
//      HashMap<Character,Integer> mp = new HashMap<>();
      
        
//         for(int i=0;i<s.length();i++){
//             char c = s.charAt(i);
//             mp.put(c,mp.getOrDefault(c,0)+1);
//         }
      
        
//         for(int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             if(mp.get(c)==1){
//                 return i;
//             }
//         }
//         return -1;
        
    //     int i = 0;
    // while (i < s.length()) {
    //     int j = 0;
    //     boolean isUnique = true;
    //     while (j < s.length()) {
    //         if (i != j && s.charAt(i) == s.charAt(j)) {
    //             isUnique = false;
    //             break;
    //         }
    //         j++;
    //     }
    //     if (isUnique) {
    //         return i;
    //     }
    //     i++;
    // }
    // return -1;
        
        
        int n = s.length();
        int[] freq = new int[26]; // Assuming only lowercase English letters
        
        // Store the frequency of each character in the string
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        
        // Find the index of the first non-repeating character
        int i = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (freq[c - 'a'] == 1) {
                return i;
            }
            i++;
        }
        
        return -1; // No non-repeating character found
    }
}