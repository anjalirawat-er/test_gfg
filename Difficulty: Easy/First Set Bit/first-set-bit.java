class Solution {
    public static int getFirstSetBit(int n) {
        // code here
    if(n == 0) return 0;

            int position = 1;

            while((n & 1) == 0){
                n = n >> 1;
                position++;
            }

            return position ;    
    }
}