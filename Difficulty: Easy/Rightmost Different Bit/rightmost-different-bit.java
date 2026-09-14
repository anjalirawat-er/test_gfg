class Solution {
    public static int posOfRightMostDiffBit(int m, int n) {
        // code here
        int count=1;
        while(m!=0 || n!=0){
            if( (m&1) != (n&1) ){
                return count;
            }
            count++;
            m>>=1;
            n>>=1;
        }

        return -1;
    }
}
