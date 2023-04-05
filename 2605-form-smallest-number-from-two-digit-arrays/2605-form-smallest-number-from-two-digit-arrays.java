

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
    
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> set= new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i: nums2){
            if(set.contains(i)){
                return i;
            }
        }

        int ans=nums1[0]*10+nums2[0];
        int ans1= nums2[0]*10+nums1[0];
        
        return Math.min(ans,ans1);
    }
}
