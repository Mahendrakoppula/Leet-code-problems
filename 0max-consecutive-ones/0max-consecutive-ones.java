class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //      int count=0;
        // int maxcount=0;
//         Stack<Integer> st= new Stack<>();

//         for(int i: nums){
//             if(i==1){
//                 st.push(i);
//                 count++;
//             }else{
//                 st.clear();
//                 if(count>maxcount){
//                     maxcount=count;
//                     count=0;
//                 }
//             }

//         }
//         return maxcount;
        
        
        
//             for (int i : nums) {
//         if (i == 1) {
//             count++;
//         } else {
//             if (count > maxcount) {
//                 maxcount = count;
//             }
//             count = 0;
//         }
//     }

//     if (count > maxcount) {
//         maxcount = count;
//     }

//     return maxcount;
        
    int maxcount = 0;
    int start = 0;
    int end = 0;

    while (end < nums.length) {
        if (nums[end] == 1) {
            end++;
        } else {
            maxcount = Math.max(maxcount, end - start);
            end++;
            start = end;
        }
    }

    maxcount = Math.max(maxcount, end - start);

    return maxcount;
            }
        }