class Solution {
    public int matrixSum(int[][] nums) {
        int ans=0;
        int n=nums.length;
        int m=nums[0].length;
        
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        
        for(int i=0;i<m;i++){
            int curr=0;
            for(int j=0;j<n;j++){
                curr=Math.max(curr,nums[j][i]);
            }
            ans+=curr;
        }
        return ans;
    }
}