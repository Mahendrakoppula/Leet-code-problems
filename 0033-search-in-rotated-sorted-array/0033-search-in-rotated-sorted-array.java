class Solution {
    public int search(int[] nums, int target) {
     int ans=0;
        // int mid=nums.length/2;
        // if(target==nums[mid])
        // {
        //     return mid;
        // }else if(target)
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}