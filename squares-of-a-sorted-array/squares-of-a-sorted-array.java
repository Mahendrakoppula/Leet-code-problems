class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<=nums.length-1;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        
        return nums;
    }
}