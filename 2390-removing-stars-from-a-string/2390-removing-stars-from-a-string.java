class Solution {
    public String removeStars(String s) {
        Stack<Character> st= new Stack<>();
        // char[] ch=s.toCharArray();
        StringBuilder sb= new StringBuilder();
     
        for(char ch : s.toCharArray()){
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        for(char ch: st){
            sb.append(ch);
        }
        return sb.toString();
    }
}