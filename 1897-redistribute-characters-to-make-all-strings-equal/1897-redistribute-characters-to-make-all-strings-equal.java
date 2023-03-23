class Solution {
    public boolean makeEqual(String[] words) {
          int[] charCount = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
        }
        for (int count : charCount) {
            if (count % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}