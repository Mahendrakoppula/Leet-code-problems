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
        
         int n = nums.length;
        int left = 1, right = n - 1, duplicate = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count <= mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
                duplicate = mid;
            }
        }
        return duplicate;
    }
}