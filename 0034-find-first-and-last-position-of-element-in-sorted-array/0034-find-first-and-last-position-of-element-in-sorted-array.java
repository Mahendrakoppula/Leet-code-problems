class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> fns = new ArrayList<>();
        int l = nums.length;
        int[] no = {-1, -1};
        for (int i = 0; i < l; i++) {
            if (nums[i] == target) {
                fns.add(i);
            }
        }
        if (fns.size() == 0) {
            return no;
        }
        int[] ans = new int[2];
        ans[0] = fns.get(0);
        ans[1] = fns.get(fns.size() - 1);
        return ans;
    }
}