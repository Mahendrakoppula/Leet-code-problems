class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        
        for(int k=i;k<nums.length;k++){
            nums[k]=0;
        }
        System.out.println(Arrays.toString(nums));
    
    }
        //   int size = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         size++;
        //     }else if(size>0){
        //         int t = nums[i];
        //         nums[i] = 0;
        //         nums[i-size] = t;
        //     }
        // }
}