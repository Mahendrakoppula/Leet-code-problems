class Solution {
    public int searchInsert(int[] nums, int target) {
//          int start = 0;
//         int end = nums.length - 1;
        
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     if(A[mid] == target) return mid;
        //     else if(A[mid] > target) high = mid-1;
        //     else low = mid+1;
        // }
        // return low;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (nums[mid] == target)
//                 return mid;

//             if (target < nums[mid])
//                 end = mid - 1;
//             else
//                 start = mid + 1;
//         }
//      return start;
        int i;
    for (i = 0; i < nums.length; i++) {
        if (nums[i] >= target) {
            break;
        }
    }
    return i;
    
    }
}