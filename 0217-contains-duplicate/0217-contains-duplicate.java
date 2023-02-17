class Solution {
    public boolean containsDuplicate(int[] nums) {
    // Arrays.sort(nums);
    // for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //         return true;
    //         }
    //         // break;
    //     }
    // }
    // return false;
    // }
    // int i=0;
    // int j=nums.length;
    // int k=i+1;
    // while(i<=j){
    //     if(nums[i]==nums[k]){
            
    //         return true;
    //     } i++;
    //         // j--;
    //         break;
            
    // }
    // return false;
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }
}