class Solution {
    public int strStr(String haystack, String needle) {
    int n = haystack.length();
    int m = needle.length();
    if (m == 0) {
        return 0;
    }
    int[] table = buildTable(needle);
    int i = 0, j = 0;
    while (i < n) {
        if (haystack.charAt(i) == needle.charAt(j)) {
            i++;
            j++;
            if (j == m) {
                return i - m;
            }
        } else if (j > 0) {
            j = table[j - 1];
        } else {
            i++;
        }
    }
    return -1;
}

private int[] buildTable(String needle) {
    int m = needle.length();
    int[] table = new int[m];
    int i = 0, j = 1;
    while (j < m) {
        if (needle.charAt(i) == needle.charAt(j)) {
            table[j] = i + 1;
            i++;
            j++;
        } else if (i > 0) {
            i = table[i - 1];
        } else {
            j++;
        }
    }
    return table;
}

}