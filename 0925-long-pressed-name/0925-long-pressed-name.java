class Solution {
//     public boolean isLongPressedName(String name, String typed) {
//         if (name.length() > typed.length()) {
//             return false;
//         }
        
//         Stack<Character> stack = new Stack<>();
//         int i = 0, j = 0;
        
//         while (i < name.length() && j < typed.length()) {
//             char c1 = name.charAt(i);
//             char c2 = typed.charAt(j);
            
//             if (c1 != c2) {
//                 if (stack.isEmpty() || stack.peek() != c2) {
//                     return false;
//                 }
//                 while (j < typed.length() && typed.charAt(j) == c2) {
//                     j++;
//                 }
//             } else {
//                 stack.push(c2);
//                 i++;
//                 j++;
//             }
//         }
        
//         while (j < typed.length()) {
//             if (stack.isEmpty() || stack.peek() != typed.charAt(j)) {
//                 return false;
//             }
//             j++;
//         }
        
//         return i == name.length() && j == typed.length();
//     }
    
       public boolean isLongPressedName(String name, String typed) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        int j = 0;
        
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                stack.push(typed.charAt(j));
                i++;
                j++;
            } else if (!stack.isEmpty() && stack.peek() == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        
        while (j < typed.length()) {
            if (!stack.isEmpty() && stack.peek() == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        
        return i == name.length();
    }
}