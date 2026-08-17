class Solution {
    static long nPr(long n, long r) {
        // code here
        long result = 1;
        for(long i = 0; i < r; i++){
            result = result*(n-i);
        }
        return result;
    }
}