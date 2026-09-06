class Solution {
    public int binaryToGray(int n) {
        return n ^ (n >> 1);
    }
}