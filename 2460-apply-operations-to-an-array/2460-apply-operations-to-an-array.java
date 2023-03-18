class Solution {
    public int[] applyOperations(int[] nums) {
       int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        return moveZeroes(nums);
    }
    public int [] moveZeroes(int[] nums) {
        int size = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                size++;
            }else if(size>0){
                int t = nums[i];
                nums[i] = 0;
                nums[i-size] = t;
            }
        }
        return nums;
    }
}