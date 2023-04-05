class Solution {
    public int numRescueBoats(int[] people, int limit) {
//         Arrays.sort(nums);
//         int i=0;
//         int j= nums.length-1;
//         int boats=0;
//         while(i<=j){
//             // if(i==j && nums[i]<=limit && nums[j]<=limit){
//             //     boats++;
//             // }
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
        
        // Arrays.sort(nums);
        // int boatCount = 0, left = 0, right = nums.length ;
// while(left <= right){
// if(nums[left] + nums[right] <= limit){
// left++;
// right--;
// }
// else{
// right--;
// }
// boatCount++;
// }
// return boatCount;
//     }
        
//       int boatCount = 0, left = 0, right = nums.length-1;
//         while(left <= right){
//             if(nums[right]==limit){
//                 boatCount++;
//                 right--;
//             }else if(nums[left]==limit){
//                 boatCount++;
//                 left++;
//             }else if(nums[left] + nums[right] <= limit){
//                 left++;
//                 right--;
//                 boatCount++;
//             }
//             else{
//                 right--;
//                 boatCount++;
//             }

//         }
//         return boatCount;
        
           if (people == null || people.length == 0 || limit <= 0) {
        return 0; // edge case: empty or null array, or invalid limit
    }

    int boatCount = 0, left = 0, right = people.length - 1;
    Arrays.sort(people); // sort the people by weight

    while (left <= right) {
        if (people[right] == limit) {
            boatCount++;
            right--;
        } else if (people[left] == limit) {
            boatCount++;
            left++;
        } else if (people[left] + people[right] <= limit) {
            left++;
            right--;
            boatCount++;
        } else {
            right--;
            boatCount++;
        }
    }

    return boatCount;
}
}