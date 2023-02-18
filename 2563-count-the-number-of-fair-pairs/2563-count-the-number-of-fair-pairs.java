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
//   Arrays.sort(nums);
//         return smaller(nums, upper) - smaller(nums, --lower);
//     }

//     private long smaller(int[] nums, int value) {
//         int l = 0, r = nums.length - 1;
//         long result = 0;
//         while (l < r) {
//             int sum = nums[l] + nums[r];
//             if (sum <= value) {
//                 result += (r - l);
//                 l++;    
//             } else {   
//                 r--;
//             }
//         }
            
//         return result;
        long res = 0;
        Arrays.sort(nums);
        int idxL = nums.length - 1, idxR = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            idxL = Math.max(idxL, i + 1);
            while (idxL - 1 > i && nums[idxL - 1] + nums[i] >= lower)
                idxL--;

            while (idxR > 0 && nums[idxR] + nums[i] > upper)
                idxR--;

            if (idxL <= idxR && nums[i] + nums[idxL] >= lower && nums[i] + nums[idxR] <= upper)
                res += idxR - idxL + 1;
        }
        return res;
}
}
