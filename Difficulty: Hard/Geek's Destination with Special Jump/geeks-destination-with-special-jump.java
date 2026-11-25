class Solution {
    private static final long MOD = 1_000_000_007L;
    private static final long INV2 = 500_000_004L;

    public int minTime(int a, int b, int d, int l, int r) {
        long la = a, lb = b, ld = d, ll = l, lr = r;
        long noJumpTime = normalTime(ld, la, lb);

        long low = ll, high = lr, split = lr + 1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (normalTime(ld - mid, la, lb) + 1 < noJumpTime) {
                split = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        long ans = 0;

        if (split > ll) {
            long count = (split - ll) % MOD;
            ans = (ans + count * (noJumpTime % MOD)) % MOD;
        }

        if (split <= lr) {
            long xStart = ld - lr;
            long xEnd = ld - split;
            long count = (xEnd - xStart + 1) % MOD;
            long sumT = sumNormalTime(xEnd, la, lb) - sumNormalTime(xStart - 1, la, lb);
            sumT = (sumT % MOD + MOD) % MOD;
            ans = (ans + sumT + count) % MOD;
        }

        return (int) ans;
    }

    // Minimum time to reach position x using normal movement alone
    private long normalTime(long x, long a, long b) {
        if (x <= 0) return 0;
        long k = (x <= a) ? 0 : (x - a + (a - b) - 1) / (a - b);
        return x + 2L * k * b;
    }

    // Computes sum of normalTime(x) for x from 1 to N modulo MOD
    private long sumNormalTime(long N, long a, long b) {
        if (N <= 0) return 0;

        long nMod = N % MOD;
        // Sum of x from 1 to N: N * (N + 1) / 2
        long sumX = nMod * ((nMod + 1) % MOD) % MOD * INV2 % MOD;

        if (N <= a) return sumX;

        long step = a - b;
        long rem = N - a;
        long fullBlocks = rem / step; // k takes values 1, 2, ..., fullBlocks, each 'step' times
        long tail = rem % step;       // k = fullBlocks + 1 appears 'tail' times

        long fbMod = fullBlocks % MOD;
        long sumKFull = (step % MOD) * (fbMod * ((fbMod + 1) % MOD) % MOD * INV2 % MOD) % MOD;
        long sumKTail = (tail % MOD) * ((fbMod + 1) % MOD) % MOD;

        long totalK = (sumKFull + sumKTail) % MOD;
        long twoB = (2L * b) % MOD;

        return (sumX + twoB * totalK) % MOD;
    }
}