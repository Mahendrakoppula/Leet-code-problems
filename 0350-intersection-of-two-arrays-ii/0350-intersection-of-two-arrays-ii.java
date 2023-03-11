class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2);
          int i = 0, j = 0;
    // Set<Integer> set = new HashSet<>();
        ArrayList<Integer> al= new ArrayList<>();

    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] == nums2[j]) {
            al.add(nums1[i]);
            i++;
            j++;
        } else if (nums1[i] < nums2[j]) {
            i++;
        } else {
            j++;
        }
    }

    int[] result = new int[al.size()];
    int k = 0;
    for (int num : al) {
        result[k++] = num;
    }
    return result;
    }
}