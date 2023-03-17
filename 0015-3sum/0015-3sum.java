class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //      Arrays.sort(nums);  // sort the input array in ascending order
    // List<List<Integer>> result = new ArrayList<>();
    // int n = nums.length;
    // for (int i = 0; i < n - 2; i++) {
    //     // skip over any element that is the same as its predecessor
    //     if (i == 0 || nums[i] != nums[i-1]) {
    //         int j = i + 1;
    //         int k = n - 1;
    //         while (j < k) {
    //             int sum = nums[i] + nums[j] + nums[k];
    //             if (sum == 0) {
    //                 result.add(Arrays.asList(nums[i], nums[j], nums[k]));
    //                 // skip over any elements that are the same as their predecessors
    //                 while (j < k && nums[j] == nums[j+1]) j++;
    //                 while (j < k && nums[k] == nums[k-1]) k--;
    //                 j++;
    //                 k--;
    //             } else if (sum < 0) {
    //                 j++;
    //             } else {
    //                 k--;
    //             }
    //         }
    //     }
    // }
    // return result;
        
         List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    for (int i = 0; i < n - 2; i++) {
        if (i == 0 || nums[i] != nums[i-1]) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j+1]) j++;
                    while (j < k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }
    return result;
    }
}