class Solution {
    public int maximizeSum(int[] nums, int k) {
         int max=nums[0];

        for(int i: nums){
            if(i>max){
                max=i;
            }
        }
        int maxsum=0;
//        for (int i = max; i <=k ; i++) {
//            maxsum+=i;
//        }
        while (k>0){
            k--;
            maxsum+=max++;

        }
        return maxsum;
    }
}