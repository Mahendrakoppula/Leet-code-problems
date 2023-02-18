class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        // long count=0;
        // Arrays.sort(nums);
//          for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
// //                if(nums[i]>lower && nums[i]<upper && nums[j]>lower && nums[j]<upper){
//                   if(nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper)
//                     count++;
//                 }
//             }
        
        // return count;
  Arrays.sort(nums);
        return smaller(nums, upper) - smaller(nums, --lower);
    }

    private long smaller(int[] nums, int value) {
        int l = 0, r = nums.length - 1;
        long result = 0;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum <= value) {
                result += (r - l);
                l++;    
            } else {   
                r--;
            }
        }
            
        return result;
}
}
