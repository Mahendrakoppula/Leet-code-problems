class Solution {
    public int findTheLongestBalancedSubstring(String s) {
//         int zerocount=0;
//     int count=0;
//     int maxcount=0;
//         Stack<Character> st= new Stack<>();
//         for( char c: s.toCharArray()){
//             if(c=='0'){
//                 st.push(c);
//                 zerocount++;
//             } else if (c=='1'&& !st.isEmpty()) {
//                 st.pop();
//                 zerocount--;
//                 count+=2;
//             }

//            if(count>maxcount){
//                maxcount=count;
//            }
//             if(zerocount==0&& st.isEmpty()){
//                 count=0;
//             }
//         }
//         return maxcount;
        
        
        
//         char[] str=s.toCharArray();
//         int n = str.length;
//         int maxi = 0;
//         int i = 0;
//         while(i < n)
//         {
//             int countZero = 0, countOne = 0;
//             while(i < n && str[i] == '0')
//             {
//                 countZero++;
//                 i++;
//             }
//             while(i < n && str[i] == '1')
//             {
//                 countOne++;
//                 i++;
//             }
//             maxi = Math.max(maxi, 2 * Math.min(countZero, countOne));
//         }
        
//         return maxi;
        

         int longest = 0;
        Stack<Character> stack = new Stack<>();
        int matches = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if (matches > 0) {
                    stack = new Stack<>();
                }
                matches = 0;
                stack.push(c);
            } else if (c == '1' && !stack.isEmpty()) {
                stack.pop();
                matches += 2;
                longest = Math.max(longest, matches);
            }
        }
        
        return Math.max(longest, matches) ;

    }  
}