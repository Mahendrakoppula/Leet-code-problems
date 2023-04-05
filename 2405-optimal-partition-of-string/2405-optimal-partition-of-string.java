class Solution {
    public int partitionString(String s) {
//         Set<Character>set= new HashSet<>();
//       int  count=0;
//         for(char c: s.toCharArray()){
//             if(set.contains(c)){
//                 count++;
                
//                 set= new HashSet<>();
//                 set.add(c);
//             }else{
//                 set.add(c);
//             }
//         }
//         if(!set.isEmpty()){
//             count++;
//         }
//         return count;
        
        // int[] arr = new int[26];
        // int ans = 0;
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(arr[ch-'a']>0){
        //         ans++;
        //         arr = new int[26];
        //     }
        //     arr[ch-'a']++;
        // }
        // return ans + 1;
        
        int[] arr= new int[26];
        int ans=0;
        for(char c: s.toCharArray()){
            if(arr[c-'a']>0){
                ans++;
                arr= new int[26];
            }
            arr[c-'a']++;
        }
        return ans+1;
    }
}