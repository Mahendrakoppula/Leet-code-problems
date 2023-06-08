class Solution {
    public int maximumCount(int[] nums) {
        int negcount=0;
        int poscount=0;
        
        for(int i: nums){
            
            if(i<0){
                negcount++;
            }else if(i>0){
                poscount++;
            }
        }
        
        if(negcount>poscount){
            return negcount;
        }
        
        return poscount;
    }
}