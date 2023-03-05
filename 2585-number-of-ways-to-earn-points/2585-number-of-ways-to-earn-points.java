class Solution {
    public int waysToReachTarget(int target, int[][] types) {
     int n = types.length;
        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int count = types[i-1][0], marks = types[i-1][1];
            for (int j = 0; j <= target; j++) {
                for (int k = 0; k <= count && k*marks <= j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j-k*marks]) % 1000000007;
                }
            }
        }
        return dp[n][target];   
    }
}