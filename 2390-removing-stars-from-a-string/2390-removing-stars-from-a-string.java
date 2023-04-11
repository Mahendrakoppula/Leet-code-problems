class Solution {
    public String removeStars(String s) {
//         Stack<Character> st= new Stack<>();
//         // char[] ch=s.toCharArray();
//         StringBuilder sb= new StringBuilder();
     
//         for(char ch : s.toCharArray()){
//             if(ch!='*'){
//                 st.push(ch);
//             }
//             else{
//                 st.pop();
//             }
//         }
//         for(char ch: st){
//             sb.append(ch);
//         }
//         return sb.toString();
        
         StringBuilder sb = new StringBuilder();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch != '*') {
            sb.append(ch);
            count++;
        } else if (count > 0) {
            sb.deleteCharAt(count - 1);
            count--;
        }
    }
    return sb.toString();
    }
}