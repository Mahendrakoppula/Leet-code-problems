

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
     // int s1 = Integer.MAX_VALUE;
     //     int s2=Integer.MAX_VALUE;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer> set = new HashSet<>();
        for(int i:nums2)
        {
            set.add(i);
        }

        for(int i:nums1)
        {
            if(set.contains(i)) return i;
        }

         int ans1 = nums1[0]*10 + nums2[0];
        int ans2 = nums2[0]*10 + nums1[0];

        return Math.min(ans1,ans2);
    }
}
