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
        

         int maxcount = 0;
        Stack<Character> stack = new Stack<>();
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if (count > 0) {
                    stack = new Stack<>();
                }
                count = 0;
                stack.push(c);
            } else if (c == '1' && !stack.isEmpty()) {
                stack.pop();
                count += 2;
                maxcount = Math.max(maxcount, count);
            }
        }
        
        return Math.max(maxcount, count) ;

    }  
}