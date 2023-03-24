class Solution {
    public int reverse(int x) {
         int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            // Check for integer overflow before updating the reversed integer
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && digit < -8)) {
                return 0;
            }
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }
}