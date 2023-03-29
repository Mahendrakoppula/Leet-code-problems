class Solution {
    public int findDuplicate(int[] nums) {
//              Set<Integer> set = new HashSet<>();
        
//         for (int num : nums) {
//             if (set.contains(num)) {
//                 return num;
//             } else {
//                 set.add(num);
//             }
//         }
        
//         return -1; 
        
//          int n = nums.length;
//         int left = 1, right = n - 1, duplicate = -1;
        
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int count = 0;
//             for (int num : nums) {
//                 if (num <= mid) {
//                     count++;
//                 }
//             }
//             if (count <= mid) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//                 duplicate = mid;
//             }
//         }
//         return duplicate;
        
//           int slow = nums[0];
//         int fast = nums[0];
        
//         do {
//             slow = nums[slow];
//             fast = nums[nums[fast]];
//         } while (slow != fast);
        
//         fast = nums[0];
//         while (slow != fast) {
//             slow = nums[slow];
//             fast = nums[fast];
//         }
        
//         return slow;
        
            for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index] < 0) {
                return index;
            } else {
                nums[index] = -nums[index];
            }
        }
        
        return -1;
    }
}