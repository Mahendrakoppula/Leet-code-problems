class Solution {
    public int singleNonDuplicate(int[] nums) {
         int i=0;
            int result=0;
            int j=1;
        int n=nums.length;
        if(nums.length<=1){
            return nums[0];
        }
        if (nums[n - 2] != nums[n - 1]){
            return nums[n-1];
            
        }  
         if (nums[i] != nums[j]) {
             return nums[i];
         }
//             while(i<nums.length-1) {
//                 if (nums[i] != nums[j]) {
//                     result = nums[i];
//                     break;
//                 } else {

//                     i = i + 2;
//                     j = j + 2;
//                 }
//             }
//             return result;
        
//         HashMap<Integer, Integer> freq = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (freq.containsKey(nums[i])) {
//               int count = freq.get(nums[i]) + 1;
//                 freq.put(nums[i], count);
//             } else {
//                 freq.put(nums[i], 1);
//             }
//         }
//         int c=0;
//         for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
//             if (i.getValue() == 1)
//                 c= i.getKey();

//         }
//         return c;
//             }
//         }
        
        
         // Binary Search
       int lo=0;
        int hi=nums.length-1;
        int mid=0;
        
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            
            if((nums[mid]==nums[mid+1] && mid%2==0)||(nums[mid]==nums[mid-1] && mid%2!=0)){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return 0;
    }
}