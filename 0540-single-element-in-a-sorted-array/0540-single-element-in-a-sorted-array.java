class Solution {
    public int singleNonDuplicate(int[] nums) {
//          int i=0;
//             int result=0;
//             int j=1;
//         int n=nums.length;
//         if(nums.length<=1){
//             return nums[0];
//         }
//         if (nums[n - 2] != nums[n - 1]){
//             return nums[n-1];
            
//         }  
//             while(i<nums.length-1) {
//                 if (nums[i] != nums[j]) {
//                     result = nums[i];
//                     break;
//                 } else {

//                     i = i + 2;
//                     j = j + 2;
//                 }
//             }
//             return result;
        
//         HashMap<Integer, Integer> freq = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (freq.containsKey(nums[i])) {
//               int count = freq.get(nums[i]) + 1;
//                 freq.put(nums[i], count);
//             } else {
//                 freq.put(nums[i], 1);
//             }
//         }
//         int c=0;
//         for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
//             if (i.getValue() == 1)
//                 c= i.getKey();

//         }
//         return c;
//             }
//         }
        
        int start = 0, end = nums.length - 1, mid;
 
        // For Edge Cases
        if (nums.length
            == 1) // If only one element is in the array
            return nums[0];
 
        if (nums[start]
            != nums[start + 1]) // If the first element
                                // is the element that
                                // appears only once
            return nums[start];
 
        if (nums[end]
            != nums[end
                    - 1]) // If Last element is the element
                          // that appears only once
            return nums[end];
 
        // Binary Search
        while (start <= end) {
            mid = start + (end - start) / 2;
            // CASE 1
            if (nums[mid] != nums[mid - 1]
                && nums[mid] != nums[mid + 1])
                return nums[mid];
            // CASE 2 and CASE 3
            else if ((nums[mid] == nums[mid + 1]
                      && mid % 2 == 0)
                     || (nums[mid] == nums[mid - 1]
                         && mid % 2 != 0))
                start = mid + 1;
            // CASE 4 and CASE 5
            else
                end = mid - 1;
        }
        // If no such element found
        return -1;
    }
}