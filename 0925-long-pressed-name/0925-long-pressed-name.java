class Solution {
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
    
//     public boolean isLongPressedName(String name, String typed) {
//         int i = 0, j = 0;
        
//         while (i < name.length() && j < typed.length()) {
//             if (name.charAt(i) == typed.charAt(j)) {
//                 i++;
//                 j++;
//             } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
//                 j++;
//             } else {
//                 return false;
//             }
//         }
        
//         while (j < typed.length() && typed.charAt(j) == typed.charAt(j - 1)) {
//             j++;
//         }
        
//         return i == name.length() && j == typed.length();
//     }
}