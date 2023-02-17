class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int result=-1;
    //     int pres=-1;
    // int cur;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(i<j && nums[i]<nums[j]){
                   int diff=nums[j]-nums[i];
                    result=Math.max(result,diff);
                // pres=cur;
                    
                }
            }
        }
        return result;
    }
}