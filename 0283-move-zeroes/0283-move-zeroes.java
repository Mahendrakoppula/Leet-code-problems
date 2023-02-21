class Solution {
    public void moveZeroes(int[] nums) {
//         int i=0;
//         int j=0;
        
//         while(j<nums.length){
//             if(nums[i]!=0){
//                 nums[i]=nums[j];
//                 i++;
//             }
//             j++;
//         }
        
//         // for(int k=i;k<nums.length-1;k++){
//         //     nums[k]=0;
//         // }
//         while(i<nums.length){
//             nums[i]=0;
//             i++;
//         }
//         System.out.println(Arrays.toString(nums));
        
        int i = 0; // slow pointer
        int j = 0; // fast pointer
//        int[] nums = {0, 1, 0, 3, 12};
        // Traverse through the array
        while (j < nums.length) {
            // If the current element is not zero, move it to the front of the array
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        // Fill the remaining elements with zeroes
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}