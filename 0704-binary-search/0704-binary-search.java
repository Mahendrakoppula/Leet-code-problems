class Solution {
    public int search(int[] nums, int target) {
        // int lo=0;
        // int hi=nums.length-1;
        // int mid=lo+(hi-lo)/2;
        // if(nums[mid]==target){
        //     return mid;
        // }
        // while(lo<=hi){
        //     if(target>nums[mid]){
        //         hi=mid-1;
        //     }else{
        //         lo=mid+1;
        //     }
        // }
        // return -1;
        
        // for(int p: nums){
        //     if(nums[p]==target){
        //         returm p;
        //     }
        // }
        // return -1;
        
        for(int i=0;i<nums.length;i++){
             if(nums[i]==target){
                 return i;
             }
         }
        return -1;
    }
}