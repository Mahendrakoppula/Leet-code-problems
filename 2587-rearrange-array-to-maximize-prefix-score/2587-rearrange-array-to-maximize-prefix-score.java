class Solution {
    public int maxScore(int[] nums) {
//         Arrays.sort(nums,Comparator.reverseOrder());
//        int count=0;
//         int curr=0;
        
//         for(int val: nums){
//             curr+=val;
//             if(curr>0){
//                 count+=1;
//             }
//         }
//         return count;
    //     Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new); // convert int[] to Integer[]
    // Arrays.sort(integers, Comparator.reverseOrder()); // sort in reverse order
    //     Arrays.sort(nums);
    // int count = 0;
    // int curr = 0;
    // for (int val : integers) {
    //      // for (int val : nums) {
    //     curr += val;
    //     if (curr > 0) {
    //         count++;
    //     }
    // }
    // return count;
        int ans = 0;
    // Arrays.sort(nums);
         Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new); // convert int[] to Integer[]
    Arrays.sort(integers, Comparator.reverseOrder()); // sort in reverse order
    long[] temp = new long[nums.length];
    temp[0] = integers[0];
    if (temp[0] > 0) ans++;
    for (int i = 1; i < nums.length; i++) {
        temp[i] = temp[i-1] + integers[i];
        if (temp[i] > 0) ans++;
    }
    return ans;
    }
}