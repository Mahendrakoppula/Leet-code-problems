class Solution {
    public int firstUniqChar(String s) {
     HashMap<Character,Integer> mp = new HashMap<>();
      
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
      
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(mp.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}