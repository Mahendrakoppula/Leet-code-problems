class Solution {
    public int maxSubArray(int[] nums) {
//          int left = 0;
//     int right = 0;
//     int maxSum = Integer.MIN_VALUE;
//     int currentSum = 0;
    
//     while (right < nums.length) {
//         currentSum += nums[right];
        
//         if (currentSum > maxSum) {
//             maxSum = currentSum;
//         }
        
//         while (currentSum < 0 && left <= right) {
//             currentSum -= nums[left];
//             left++;
//         }
        
//         right++;
//     }
    
//     return maxSum;
    
        // int maxsum= nums[0];
        //    if (nums.length == 1) {
        //     maxsum = nums[0];
        // }
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum += nums[j];
        //         maxsum=Math.max(sum,maxsum);
        //     }
        // }
        // return maxsum;
        
        int sum=0;
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}