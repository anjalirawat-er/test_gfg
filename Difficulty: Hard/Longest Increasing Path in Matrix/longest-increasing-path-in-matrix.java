class Solution {
    
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int longIncPath(int[][] matrix, int n, int m) {
        if (n == 0 || m == 0) return 0;

        int[][] memo = new int[n][m];
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxLength = Math.max(maxLength, dfs(matrix, i, j, memo, n, m));
            }
        }

        return maxLength;
    }

    private int dfs(int[][] matrix, int r, int c, int[][] memo, int n, int m) {
        if (memo[r][c] != 0) {
            return memo[r][c];
        }

        int max = 1; 

        for (int[] dir : DIRS) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr >= 0 && nr < n && nc >= 0 && nc < m && matrix[nr][nc] > matrix[r][c]) {
                max = Math.max(max, 1 + dfs(matrix, nr, nc, memo, n, m));
            }
        }

        memo[r][c] = max;
        return max;
    }
}