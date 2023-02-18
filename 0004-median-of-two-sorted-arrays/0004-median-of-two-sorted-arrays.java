class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m > n) { // to ensure nums1 is shorter than nums2
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && nums2[j-1] > nums1[i]) {
                iMin = i + 1;
            } else if (i > iMin && nums1[i-1] > nums2[j]) {
                iMax = i - 1;
            } else {
                int maxLeft = (i == 0) ? nums2[j-1] :
                    (j == 0) ? nums1[i-1] : Math.max(nums1[i-1], nums2[j-1]);
                if ((m + n) % 2 == 1) return maxLeft;
                int minRight = (i == m) ? nums2[j] :
                    (j == n) ? nums1[i] : Math.min(nums1[i], nums2[j]);
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0; // should never reach here
    }
}