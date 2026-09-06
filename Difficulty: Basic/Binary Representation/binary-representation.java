class Solution {
    public String getBinaryRep(int n) {
        StringBuilder sb = new StringBuilder(32);
        for (int i = 31; i >= 0; i--) {
            sb.append((n >> i) & 1);
        }
        return sb.toString();
    }
}