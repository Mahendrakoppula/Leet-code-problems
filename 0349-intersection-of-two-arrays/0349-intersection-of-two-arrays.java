class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> st1=new HashSet<>();
        
//         for(int i=0;i<nums1.length;i++){
//             st1.add(nums1[i]);
//         }
//         Set<Integer> st3=new HashSet<>();
//         for(int i=0;i<nums2.length;i++){
//             if(st1.contains(nums2[i])){
//                 st3.add(nums2[i]);
//             }
//         }
        
//         int[] result =new int[st3.size()];
//         int i=0;
//         for(int val:st3){
//             result[i++]=val;
//         }
//         return result;
        
        
//         int i=0;
//         int j=0;
//         Set<Integer>set= new HashSet<>();
        
//         while(i<nums1.length && j<nums2.length){
//             if(nums1[i]==nums2[j]){
//                 set.add(nums1[i]);
//                 i++;
//             j++;
//             }else if(nums1[i]<nums2[j]){
//                 i++;
//             }else{
//                 j++;
//             }   
//         }
//         int[] result= new int[set.size()];
//         int k=0;
//         for(int val: set){
//             result[k++]=val;
//         }
//         return result;
        
        //two pointer
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//           int i = 0, j = 0;
//     Set<Integer> set = new HashSet<>();
    
//     while (i < nums1.length && j < nums2.length) {
//         if (nums1[i] == nums2[j]) {
//             set.add(nums1[i]);
//             i++;
//             j++;
//         } else if (nums1[i] < nums2[j]) {
//             i++;
//         } else {
//             j++;
//         }
//     }

//     int[] result = new int[set.size()];
//     int k = 0;
//     for (int num : set) {
//         result[k++] = num;
//     }
//     return result;
        
          // Sort nums1 in ascending order
//     Arrays.sort(nums1);

//     // Use a set to store the intersection of nums1 and nums2
//     Set<Integer> result = new HashSet<>();

//     // Traverse nums2 and perform binary search in nums1
//     for (int num : nums2) {
//         if (binarySearch(nums1, num)) {
//             result.add(num);
//         }
//     }

//     // Convert the result set to an array and return it
//     int[] resultArr = new int[result.size()];
//     int i = 0;
//     for (int num : result) {
//         resultArr[i++] = num;
//     }
//     return resultArr;
// }

// // Binary search function
// private boolean binarySearch(int[] nums, int target) {
//     int left = 0, right = nums.length - 1;
//     while (left <= right) {
//         int mid = left + (right - left) / 2;
//         if (nums[mid] == target) {
//             return true;
//         } else if (nums[mid] < target) {
//             left = mid + 1;
//         } else {
//             right = mid - 1;
//         }
//     }
//     return false;
// }
//     }
       
              boolean[] arr =new boolean[1024];
        for(int i:nums1)
            arr[i]=true;

        int ans[]=new int[Math.min(nums1.length,nums2.length)];
        int cnt=0;
        for(int i:nums2){
            if(arr[i]){
                ans[cnt]=i;
                cnt++;
                arr[i]=false;
            }
        }

        return Arrays.copyOf(ans,cnt);
        
    }
}
        
        
        
        