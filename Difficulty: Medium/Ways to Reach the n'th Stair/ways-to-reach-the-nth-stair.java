class Solution {
    public int countWays(int n) {
        // code here
        if (n <= 1) {
            return 1;
        }

        return countWays(n - 1) + countWays(n - 2);
    }
}