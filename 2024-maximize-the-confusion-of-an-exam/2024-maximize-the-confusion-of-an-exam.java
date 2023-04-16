class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
//          int n = answerKey.length();
//         int maxCount = 0;
//         int countT = 0, countF = 0;
//         Queue<Character> queue = new LinkedList<>();
        
//         for (int i = 0; i < n; i++) {
//             char c = answerKey.charAt(i);
//             queue.offer(c);
//             if (c == 'T') {
//                 countT++;
//             } else {
//                 countF++;
//             }
            
//             while (Math.min(countT, countF) > k) {
//                 char removed = queue.poll();
//                 if (removed == 'T') {
//                     countT--;
//                 } else {
//                     countF--;
//                 }
//             }
            
//             maxCount = Math.max(maxCount, queue.size());
//         }
        
//         return maxCount;
        
//           int n = answerKey.length();
//         int maxCount = 0;
//         int countT = 0, countF = 0;
//         Stack<Character> stack = new Stack<>();
        
//         for (int i = 0; i < n; i++) {
//             char c = answerKey.charAt(i);
//             stack.push(c);
//             if (c == 'T') {
//                 countT++;
//             } else {
//                 countF++;
//             }
            
//             while (Math.min(countT, countF) > k) {
//                 char removed = stack.pop();
//                 if (removed == 'T') {
//                     countT--;
//                 } else {
//                     countF--;
//                 }
//             }
            
//             maxCount = Math.max(maxCount, stack.size());
//         }
        
//         return maxCount;
        
        
//         int n = answerKey.length();
//         int maxCount = 0;
        
//         // Counting consecutive T's
//         int countT = 0;
//         for (int i = 0; i < n; i++) {
//             if (answerKey.charAt(i) == 'T') {
//                 countT++;
//             } else {
//                 countT = 0;
//             }
//             maxCount = Math.max(maxCount, countT);
//         }
        
//         // Counting consecutive F's
//         int countF = 0;
//         for (int i = 0; i < n; i++) {
//             if (answerKey.charAt(i) == 'F') {
//                 countF++;
//             } else {
//                 countF = 0;
//             }
//             maxCount = Math.max(maxCount, countF);
//         }
        
//         // Adjusting for k
//         if (k > 0) {
//             countT = 0;
//             countF = 0;
//             int left = 0, right = 0;
//             while (right < n) {
//                 if (answerKey.charAt(right) == 'T') {
//                     countT++;
//                 } else {
//                     countF++;
//                 }
//                 right++;
//                 while (Math.min(countT, countF) > k) {
//                     if (answerKey.charAt(left) == 'T') {
//                         countT--;
//                     } else {
//                         countF--;
//                     }
//                     left++;
//                 }
//                 maxCount = Math.max(maxCount, right - left);
//             }
//         }
        
//         return maxCount;
        
 
        // int n = answerKey.length();
        // int left = 0, right = 0;
        // int maxCount = 0, countT = 0, countF = 0;
        // while (right < n) {
        //     if (answerKey.charAt(right) == 'T') {
        //         countT++;
        //     } else {
        //         countF++;
        //     }
        //     while (Math.min(countT, countF) > k) {
        //         if (answerKey.charAt(left) == 'T') {
        //             countT--;
        //         } else {
        //             countF--;
        //         }
        //         left++;
        //     }
        //     maxCount = Math.max(maxCount, right - left + 1);
        //     right++;
        // }
        // return maxCount;
        
        //  int n = answerKey.length();
        // int left = 0, right = 0;
        // int maxCount = 0;
        // int count = 0, changes = 0;
        // while (right < n) {
        //     if (answerKey.charAt(right) != answerKey.charAt(left)) {
        //         changes++;
        //     }
        //     while (changes > k) {
        //         if (answerKey.charAt(left) != answerKey.charAt(left + 1)) {
        //             changes--;
        //         }
        //         left++;
        //     }
        //     count = Math.max(count, right - left + 1);
        //     right++;
        // }
        // return count;
        
          int n = answerKey.length();
        int left = 0, right = 0, maxCount = 0, tCount = 0, fCount = 0;

        while (right < n) {
            if (answerKey.charAt(right) == 'T') {
                tCount++;
            } else {
                fCount++;
            }

            while (Math.min(tCount, fCount) > k) {
                if (answerKey.charAt(left) == 'T') {
                    tCount--;
                } else {
                    fCount--;
                }
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
            right++;
        }

        return maxCount;
    }
}