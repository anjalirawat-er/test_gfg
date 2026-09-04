class CheckBit {
    static boolean checkKthBit(int n, int k) {
        int mask = 1 << k;
        return (n & mask) > 0 ;
    }
}