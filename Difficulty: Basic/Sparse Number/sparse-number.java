class Solution {
    public static boolean isSparse(int n) {
        // code here
        return (n & (n >> 1)) == 0 ? true : false;
    }
}
