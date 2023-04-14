class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;
        
        // for(int i:nums){
        //     String s=Integer.toString(i);
        //     if(s.length()%2==0){
        //         count++;
        //     }
        // }
        // return count;
        
        for(int i:nums){
            if(digitnum(i)%2==0){
                count++;
            }
        }
        return count;
    }
    
    private int digitnum(int num){
        int digits=0;
        
        while(num!=0){
            digits++;
            num/=10;
        }
        return digits;
    }
}