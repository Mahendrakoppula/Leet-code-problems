class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int lo=0;
        int hi=nums.length-1;
        int mid=0;
        int close=nums[0];
        
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid]>=0){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
            if (Math.abs(nums[mid])<Math.abs(close)){
                close=nums[mid];
            }else if (Math.abs(nums[mid])==Math.abs(close)){
                close=Math.max(close,nums[mid]);
            }  
        }
        return close;
        // Arrays.sort(nums);
        // int left = 0, right = nums.length - 1;
        // int closest = nums[0];
        // while (left <= right) {
        //     int mid = (left + right) / 2;
        //     if (nums[mid] >= 0) {
        //         right = mid - 1;
        //     } else {
        //         left = mid + 1;
        //     }
        //     if (Math.abs(nums[mid]) < Math.abs(closest)) {
        //         closest = nums[mid];
        //     } else if (Math.abs(nums[mid]) == Math.abs(closest)) {
        //         closest = Math.max(closest, nums[mid]);
        //     }
        // }
        // return closest;
    }
    }