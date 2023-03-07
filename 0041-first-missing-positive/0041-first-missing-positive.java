class Solution {
    public int firstMissingPositive(int[] nums) {
          for (int i = 0; i < nums.length; i++) {
        while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]) {
            int temp = nums[nums[i]-1];
            nums[nums[i]-1] = nums[i];
            nums[i] = temp;
        }
    }
    
    // Step 2: use binary search to find the smallest missing positive integer
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != i+1) {
            return i+1;
        }
    }
    
    // All positive integers are present, so return the next integer
    return nums.length+1;
        
    //          Set<Integer> set = new HashSet<Integer>();
    // int max = 0;
    // for (int num : nums) {
    //     if (num > 0) {
    //         set.add(num);
    //         max = Math.max(max, num);
    //     }
    // }
    // for (int i = 1; i <= max + 1; i++) {
    //     if (!set.contains(i)) {
    //         return i;
    //     }
    // }
    // return 1;
    }
}