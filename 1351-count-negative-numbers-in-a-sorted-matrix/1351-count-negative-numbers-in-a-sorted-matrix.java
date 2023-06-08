class Solution {
    public int countNegatives(int[][] grid) {
        // int count=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[i].length;j++){
        //         if(grid[i][j]<0){
        //             count++;
        //         }
        //     }
        // }
        // System.gc();
        // return count;
        
        int n=grid.length;
        int m=grid[0].length;
        int r=n-1;
        int c=0;
        int count=0;

        while(r>=0 && c<m){
           if(grid[r][c]<0){
               --r;
               count+=m-c;
           } else{
               ++c;
           }
        }
        System.gc();
        return count;
    }
}