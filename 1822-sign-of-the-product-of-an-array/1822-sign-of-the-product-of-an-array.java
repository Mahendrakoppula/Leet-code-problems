class Solution {
    public int arraySign(int[] nums) {
        int neg=0;
        int count=0;
        for(int i:nums){
            if(i==0){
                return 0;
            }else if(i<=0){
                neg++;
            }
        }
        if(neg%2==0){
            return 1;
        }
        
        return -1;
    }
}