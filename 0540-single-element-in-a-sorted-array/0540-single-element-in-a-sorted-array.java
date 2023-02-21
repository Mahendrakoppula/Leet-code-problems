class Solution {
    public int singleNonDuplicate(int[] nums) {
         int i=0;
            int result=0;
            int j=1;
        int n=nums.length;
        if(nums.length<=1){
            return nums[0];
        }
        if (nums[n - 2] != nums[n - 1]){
            return nums[n-1];
            
        }  
            while(i<nums.length-1) {
                if (nums[i] != nums[j]) {
                    result = nums[i];
                    break;
                } else {

                    i = i + 2;
                    j = j + 2;
                }
            }
            return result;
    }
}