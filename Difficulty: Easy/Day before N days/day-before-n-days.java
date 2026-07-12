class Solution {
    public static int nthDay(int d, int n) {
        int daysToSubtract = n % 7;
        int ans = (d - daysToSubtract + 7) % 7;
        
        return ans;
    }
}