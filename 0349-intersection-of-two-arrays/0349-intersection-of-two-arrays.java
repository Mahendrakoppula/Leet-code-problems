class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st1=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            st1.add(nums1[i]);
        }
        Set<Integer> st3=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(st1.contains(nums2[i])){
                st3.add(nums2[i]);
            }
        }
        
        int[] result =new int[st3.size()];
        int i=0;
        for(int val:st3){
            result[i++]=val;
        }
        return result;
    }
}