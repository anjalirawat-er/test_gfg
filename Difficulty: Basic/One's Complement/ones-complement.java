class Solution {
    static int onesComplement(int n) {
        for(int i=1;i<=n;i*=2){
            n^=i;
        }
        return n;
    }
}