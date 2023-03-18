class Solution {
    public void moveZeroes(int[] nums) {
//         int i=0;
//         int j=0;
        
//         while(j<nums.length){
//             if(nums[j]!=0){
//                 nums[i]=nums[j];
//                 i++;
//             }
//             j++;
//         }
        
//         for(int k=i;k<nums.length;k++){
//             nums[k]=0;
//         }
//         System.out.println(Arrays.toString(nums));
    
//     }
          int size = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                size++;
            }else if(size>0){
                int t = nums[i];
                nums[i] = 0;
                nums[i-size] = t;
            }
        }
        
     //    class Solution {
     // public void moveZeroes(int[] nums) {
        
//         for(int i=0;i<nums.length;i++){
//             int begin = i;
//             int minindex = minIndex(nums,begin,nums.length-1);
//             if(nums[i]==0){
//             swapping(nums, i, minindex);
//         }
//     }
//     }
    
//     static void swapping(int[] arr , int first,int last){
//        // if(first!=last){
//         int temp = arr[first];
//         arr[first] = arr[last];
//         arr[last] = temp;
// }
//     static int minIndex(int[] arr,int begin,int end ){
//         int min = begin;
//         for(int i=begin;i<=end;i++){
//             if(arr[i]<arr[min]){
//                 min=i;
//             }
//         }
//         return min;
        
        
        
           // public void moveZeroes(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         int begin = i;
    //         int minindex = minIndex(nums,begin,nums.length-1);
    //         if(nums[i]==0){
    //         swapping(nums, i, minindex);
    //     }
    // }
    // }
    
    // static void swapping(int[] arr , int first,int last){
    //    // if(first!=last){
    //     int temp = arr[first];
    //     arr[first] = arr[last];
    //     arr[last] = temp;
// }
    // static int minIndex(int[] arr,int begin,int end ){
    //     int min = begin;
    //     for(int i=begin;i<=end;i++){
    //         if(arr[i]<arr[min]){
    //             min=i;
    //         }
    //     }
    //     return min;
    // }
//     public void moveZeroes(int[] nums) {
//     int n = nums.length;
//     for (int i = 0; i < n; i++) {
//         if (nums[i] == 0) {
//             int j = i + 1;
//             int firstNonZeroIndex = -1;
//             int firstNonZero
// Rakesh Chowdary13:14
// = Integer.MAX_VALUE;
//             while (j < n) {
//                 if (nums[j] != 0 && nums[j] < firstNonZero) {
//                     firstNonZeroIndex = j;
//                     firstNonZero = nums[j];
//                 }
//                 j++;
//             }
//             if (firstNonZeroIndex != -1) {
//                 nums[i] = nums[firstNonZeroIndex];
//                 nums[firstNonZeroIndex] = 0;
//             } else {
//                 break;
//             }
//         }
// }
// }
// public void moveZeroes(int[] nums) {
//     for(int i=0;i<nums.length;i++){
//         int begin = i;
//         int minindex = minNonZeroIndex(nums, begin, nums.length-1);
//         if(nums[i]==0 && minindex!=-1){
//             swapping(nums, i, minindex);
//         }
//     }
// }

// static void swapping(int[] arr , int first,int last){
//     int temp = arr[first];
//     arr[first] = arr[last];
//     arr[last] = temp;
// }
//     static int minNonZeroIndex(int[] arr, int begin, int end) {
//     int min = -1;
//     for (int i = begin; i <= end; i++) {
//         if (arr[i] != 0 && (min == -1 || arr[i] < arr[min])) {
//             min = i;
//         }
//     }
//     return min;
// }


// static int minNonZeroIndex(int[] arr,int begin,int end ){
//     int min = -1;
//     for(int i=begin;i<=end;i++){
//         if(arr[i]!=0 && (min==-1 || arr[i]<arr[min])){
//             min=i;
//         }
//     }
//     return min;
// }
// int size = 0;
// for(int i=0;i<nums.length;i++){
//     if(nums[i]==0){
//         size++;
//     }else if(size>0){
//     //    int t = nums[i];
//                 nums[i-size] = nums[i];

//         nums[i]=0;
//     }
// }
    
    
//     public void moveZeroes(int[] nums) {
//     Map<Integer, Integer> map = new HashMap<>();
//     int countZeros = 0;
    
//     for (int i = 0; i < nums.length; i++) {
//         if (nums[i] == 0) {
//             countZeros++;
//         } else {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
//     }
    
//     int i = 0;
//     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//         int key = entry.getKey();
//         int value = entry.getValue();
//         while (value > 0) {
//             nums[i++] = key;
//             value--;
//         }
//     }
    
//     while (countZeros > 0) {
//         nums[i++] = 0;
//         countZeros--;
//     }
// }

    }
}