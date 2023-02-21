class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer>st= new Stack<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()||nums[i]!=st.peek()){
                st.push(nums[i]);
                count=1;
            }else if(count==1){
                st.push(nums[i]);
                count=2;
            }
        }
        
        for(int i=0;i<st.size();i++){
            nums[i]=st.get(i);
        }
        return st.size();
    }
}