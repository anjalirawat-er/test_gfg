class Solution {
    static long kthDigit(int a, int b, int k) {
        long p = 1;
        for(int i=1; i<=b; i++){
            p = p*a;
        }
        for (int i=1; i<k; i++){
            p = p/10;
        }
        return p%10;
    }
}