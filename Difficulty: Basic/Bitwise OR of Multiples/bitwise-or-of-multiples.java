class Solution {
    public int findOR(int[] arr, int x) {
        int ans = 0;
        for (int num : arr) {
            if (num % x == 0) {
                ans |= num;
            }
        }
        return ans;
    }
}