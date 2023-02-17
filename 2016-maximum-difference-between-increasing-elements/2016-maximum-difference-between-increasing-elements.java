class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int result=-1;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(i<i+1 && nums[i]<nums[i+1]){
        //            int diff=nums[i+1]-nums[i];
        //             result=Math.max(result,diff);   
        //         }
        //     }
        // }
        // return result;
        

        int element=nums[0];
        for(int i=1;i<n;i++){
            int diff=nums[i]-element;
            
            if(result<diff && diff>0){
                result=diff;
            }
            if(element>nums[i]){
                element=nums[i];
            }
        }
        return result;
    }
}