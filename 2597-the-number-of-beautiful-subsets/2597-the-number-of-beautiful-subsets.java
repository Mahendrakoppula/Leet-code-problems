class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> seen = new HashMap<>();
        int n = nums.length;
        return dfs(nums, k, seen, n, 0) - 1;
    }
    
    private int dfs(int[] nums, int k, Map<Integer, Integer> seen, int n, int i) {
        if (i == n) {
            return 1;
        }
        int res = 0;
        if (seen.getOrDefault(nums[i] - k, 0) == 0) {
            seen.put(nums[i], seen.getOrDefault(nums[i], 0) + 1);
            res += dfs(nums, k, seen, n, i + 1);
            seen.put(nums[i], seen.get(nums[i]) - 1);
        }
        res += dfs(nums, k, seen, n, i + 1);
        return res;
        
        
//         int[] memo = new int[nums.length];
//         Arrays.fill(memo, -1);
//         int n = nums.length;
//         return dfs(nums, k, memo, n, 0) - 1;
//     }
    
//     private int dfs(int[] nums, int k, int[] memo, int n, int i) {
//         if (i == n) {
//             return 1;
//         }
//         if (memo[i] != -1) {
//             return memo[i];
//         }
//         int res = 0;
//         if (i == 0 || nums[i] - nums[i-1] > k) {
//             res += dfs(nums, k, memo, n, i + 1);
//         }
//         res += dfs(nums, k, memo, n, i + 1);
//         memo[i] = res;
//         return res;
    }
}




// class Solution {
//     // public int beautifulSubsets(int[] nums, int k) {
//     //     int n = nums.length;
//     // int[][] dp = new int[n+1][k];
//     // for (int i = 0; i < k; i++) {
//     //     dp[0][i] = 1;
//     // }
//     // for (int i = 1; i <= n; i++) {
//     //     for (int j = 0; j < k; j++) {
//     //         dp[i][j] = dp[i-1][j];
//     //         if (j >= nums[i-1]) {
//     //             dp[i][j] += dp[i-1][j-nums[i-1]];
//     //         }
//     //         if (j+nums[i-1] < k) {
//     //             dp[i][j] += dp[i-1][j+nums[i-1]];
//     //         }
//     //     }
//     // }
//     // int ans = 0;
//     // for (int i = 0; i < k; i++) {
//     //     ans += dp[n][i];
//     // }
//     // return ans;
//     // }
//        public int numOfBeautifulSubsets(int[] nums, int k) {
//     int n = nums.length;
//     int ans = 0;
//     Arrays.sort(nums);

//     // dp[i] stores the number of beautiful subsets that end with nums[i]
//     int[] dp = new int[n];

//     for (int i = 0; i < n; i++) {
//         dp[i] = 1; // every number forms a beautiful subset with itself
//         for (int j = 0; j < i; j++) {
//             if (nums[i] - nums[j] != k) {
//                 dp[i] += dp[j]; // add the number of beautiful subsets that end with nums[j]
//             }
//         }
//         ans += dp[i]; // add the number of beautiful subsets that end with nums[i]
//     }
//     return ans;

//     }
// }