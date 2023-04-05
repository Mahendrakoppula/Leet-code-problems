class Solution {
    public int numRescueBoats(int[] nums, int limit) {
//          int i=0;
//         int j= nums.length-1;
//         int boats=0;
//         while(i<=j){
//             if(i==j && nums[i]<=limit && nums[j]<=limit){
//                 boats++;
//             }
//             if(nums[i]==limit){
//                 boats++;
//                 i++;
//             }else if(nums[j]==limit){
//                 boats++;
//                 j--;
//             }

//             if(nums[i]+nums[j]<=limit){
//                 i++;
//                 j--;
//                 boats++;
//             }else{
//                 j--;
//             }
//         }
//         return boats;
        
        Arrays.sort(nums);
        int boatCount = 0, left = 0, right = nums.length - 1;
while(left <= right){
if(nums[left] + nums[right] <= limit){
left++;
right--;
}
else{
right--;
}
boatCount++;
}
return boatCount;
    }
}