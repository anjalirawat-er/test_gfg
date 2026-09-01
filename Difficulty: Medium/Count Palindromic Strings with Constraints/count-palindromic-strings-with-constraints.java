class Solution {
    public int palindromicStrings(int n, int k) {
        long MOD = 1_000_000_007;

        // nPr table: nPr[i][j] = P(i, j)
        long[][] P = new long[k + 1][k + 1];
        for (int i = 0; i <= k; i++) {
            P[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                P[i][j] = (P[i][j - 1] * (i - j + 1)) % MOD;
            }
        }
        long ans = 0;
        int m = n / 2;

        for (int len = 1; len <= m; len++) {
            ans = (ans + P[k][len]) % MOD;
        }

        ans = (ans * 2) % MOD;

        if (n % 2 != 0) {
            ans = (ans + P[k][m + 1]) % MOD;
        }

        return (int) ans;
    }
}