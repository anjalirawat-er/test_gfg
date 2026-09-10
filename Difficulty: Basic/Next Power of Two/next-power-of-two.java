class Solution {
    static int nextPowerOfTwo(int n) {
    if((n & (n-1)) == 0) return n;  // Brian Kernighan’s Algorithm 

    int count = 0;
    while(n > 0) {
        count++;
        n >>= 1;
    }
    return 1 << count;
    }
}