class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
//         Stack<Character>st= new Stack<>();
        
//         if(magazine.length()<ransomNote.length()){
//             return false;
//         }
        
//        // for(int i=0;i<ransomNote.length();i++){
//        //     for(int j=0;j<magazine.length();j++){
//        //         char c=ransomNote.charAt(i);
//        //         char d=magazine.charAt(j);
//        //         if(c==d){
//        //             st.push(c);
//        //         }
//        //     }
//        // }
//        //  if(ransomNote.length()==st.size()){
//        //      return true;
//        //  }
//        //  return false;
        
        
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
        
        
//          Queue<Character> queue = new LinkedList<>();

//         // Push all the characters in the ransomNote to the queue
//         for (int i = 0; i < ransomNote.length(); i++) {
//             queue.offer(ransomNote.charAt(i));
//         }

//         // Iterate through the magazine
//         for (int i = 0; i < magazine.length() && !queue.isEmpty(); i++) {
//             char c = magazine.charAt(i);
//             if (c == queue.peek()) {
//                 queue.poll();
//             }
//         }

//         return queue.isEmpty();
        
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        // Count the frequency of characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Check if we can construct ransomNote using magazine
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        
        return true;
  }
}