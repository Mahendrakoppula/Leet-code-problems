class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      //naive approach
    //     int[] newarr = new int[nums1.length + nums2.length];
    // System.arraycopy(nums1, 0, newarr, 0, nums1.length);
    // System.arraycopy(nums2, 0, newarr, nums1.length, nums2.length);
    // Arrays.sort(newarr);
    // double n = newarr.length;
    // if (newarr.length % 2 == 0) {
    //     return (double) (newarr[(int) (n / 2) - 1] + newarr[(int) (n / 2)]) / 2.0;
    // } else {
    //     return (double) newarr[(int) ((n - 1) / 2)];
    // }
        
        //binary search
        if(nums1.length>nums2.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        int lo=0;
        int hi=nums1.length;
        int te=nums1.length+nums2.length;
        
        while(lo<=hi){
            int aleft=(lo+hi)/2;
            int bleft=(te+1)/2-aleft;
            
            int alm1=(aleft==0)?Integer.MIN_VALUE:nums1[aleft-1];
            int al=(aleft==nums1.length)?Integer.MAX_VALUE:nums1[aleft];
            int blm1=(bleft==0)?Integer.MIN_VALUE:nums2[bleft-1];
            int bl=(bleft==nums2.length)?Integer.MAX_VALUE:nums2[bleft];
            
            if(alm1<=bl && blm1<=al){
                double median=0.0;
                if(te%  2 == 0){
                    int lmax=Math.max(alm1,blm1);
                    int rmin=Math.min(al,bl);
                    median=(lmax+rmin)/2.0;
                }else
                {
                    int lmax=Math.max(alm1,blm1);
                    median=lmax;
                }
                return median;
            }
            else if(alm1>bl){
                hi=aleft-1;
            }else if(blm1>al){
                lo=aleft+1;
            }
        }
        return 0;
    }
}