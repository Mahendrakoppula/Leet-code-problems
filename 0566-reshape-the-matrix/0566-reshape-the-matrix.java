class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
                int m = mat.length;
    int n = mat[0].length;
    
    // If the original matrix can't be reshaped to the given dimensions, return the original matrix.
    if (m * n != r * c) {
        return mat;
    }
    
    int[][] reshapedMat = new int[r][c];
    int row = 0;
    int col = 0;
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            reshapedMat[row][col] = mat[i][j];
            col++;
            if (col == c) {
                row++;
                col = 0;
            }
        }
    }
     return reshapedMat;
    }
}