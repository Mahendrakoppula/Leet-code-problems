class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
//         int lo=0;
//         int hi=nums.length-1;
//         int mid=0;
//         int close=nums[0];
        
//         while(lo<=hi){
//             mid=lo+(hi-lo)/2;
//             if(nums[mid]>=0){
//                 hi=mid-1;
//             }else{
//                 lo=mid+1;
//             }
//             if (Math.abs(nums[mid])<Math.abs(close)){
//                 close=nums[mid];
//             }else if (Math.abs(nums[mid])==Math.abs(close)){
//                 close=Math.max(close,nums[mid]);
//             }  
//         }
//         return close;
        
   int close=nums[0];
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(close)){
                    close=nums[i];
        }else if(Math.abs(nums[i])==Math.abs(close)){
            close=Math.max(nums[i],close);
        }
    }
        return close;
    }
}