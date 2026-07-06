class Solution {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n];

        for (int cl = 2; cl < n; cl++) {
            for (int i = 1; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                
                dp[i][j] = Integer.MAX_VALUE;
                
                for (int k = i; k <= j - 1; k++) {
                    int q = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    
                    if (q < dp[i][j]) {
                        dp[i][j] = q;
                    }
                }
            }
        }
        
        return dp[1][n - 1];
    }
}