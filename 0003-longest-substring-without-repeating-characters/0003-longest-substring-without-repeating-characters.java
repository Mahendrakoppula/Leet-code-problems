class Solution {
    public int lengthOfLongestSubstring(String s) {
//         HashMap<Character,Integer>mp= new HashMap<>();
//         int left=0,right=0;
//         int n=s.length();
//         int len=0;
//         while(right<n){
//             if(mp.containsKey(s.charAt(right))){
//                 left=Math.max(mp.get(s.charAt(right))+1,left);
//             }
//                 mp.put(s.charAt(right),right);
//                 len=Math.max(len,right-left+1);
//                 right++;
            
//         }
//         return len;
    
    int n = s.length();
    int maxlen = 0;
    Set<Character> set = new HashSet<>();
    int i = 0, j = 0;
    
    while (i < n && j < n) {
        if (!set.contains(s.charAt(j))) {
            set.add(s.charAt(j));
            j++;
            maxlen = Math.max(maxlen, j - i);
        } else {
            set.remove(s.charAt(i));
            i++;
        }
    }
    
    return maxlen;
    }
}