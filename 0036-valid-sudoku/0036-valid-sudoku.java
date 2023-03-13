class Solution {
    public boolean isValidSudoku(char[][] board) {
          Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }
        
        // Iterate through each cell of the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;  // Skip empty cells
                }
                if (rows[i].contains(c) || cols[j].contains(c) || boxes[(i/3)*3+j/3].contains(c)) {
                    return false;  // Duplicate value found
                }
                rows[i].add(c);
                cols[j].add(c);
                boxes[(i/3)*3+j/3].add(c);
            }
        }
         return true;
    }
}