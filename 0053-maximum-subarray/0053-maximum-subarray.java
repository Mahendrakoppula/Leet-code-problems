class Solution {
    public int maxSubArray(int[] nums) {
         int left = 0;
    int right = 0;
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    
    while (right < nums.length) {
        currentSum += nums[right];
        
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
        
        while (currentSum < 0 && left <= right) {
            currentSum -= nums[left];
            left++;
        }
        
        right++;
    }
    
    return maxSum;
    
    }
}