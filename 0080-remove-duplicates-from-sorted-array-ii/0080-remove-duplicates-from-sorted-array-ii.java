class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
    int count = 0;
    
    for (int num : nums) {
        if (stack.isEmpty() || num != stack.peek()) {
            stack.push(num);
            count = 1;
        } else if (count == 1) {
            stack.push(num);
            count = 2;
        }
    }
    
    for (int i = 0; i < stack.size(); i++) {
        nums[i] = stack.get(i);
    }
    
    return stack.size();
    }
}