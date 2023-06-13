class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
                sb.append(grid[i][j]);
                sb.append(",");
            }
            String row = sb.toString();
            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        for (int j = 0; j < grid[0].length; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < grid.length; i++) {
                sb.append(grid[i][j]);
                sb.append(",");
            }
            String column = sb.toString();
            ans += map.getOrDefault(column, 0);
        }

        return ans;
    }
}