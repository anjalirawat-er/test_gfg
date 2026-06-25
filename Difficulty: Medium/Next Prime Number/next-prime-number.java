class Solution {
    public static int nextPrime(int n) {
        int num = n + 1;

        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}