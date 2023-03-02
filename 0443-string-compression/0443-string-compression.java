class Solution {
    public int compress(char[] chars) {
            int n = chars.length;
        int i = 0, j = 0; // i is the slow pointer, j is the fast pointer
        while (j < n) {
            int count = 0; // count the number of consecutive repeating characters
            char c = chars[j];
            while (j < n && chars[j] == c) {
                j++;
                count++;
            }
            chars[i++] = c; // update the character at the slow pointer position
            if (count > 1) {
                String num = String.valueOf(count);
                for (int k = 0; k < num.length(); k++) {
                    chars[i++] = num.charAt(k);
                }
            }
        }
        return i;
    }
  
}