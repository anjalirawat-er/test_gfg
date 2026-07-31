class Solution {
    static int countSquares(int n) {
        if(n<1){
            return 0;
        }
        int b= (int)Math.sqrt(n-1);
        
        return b;
        
    }
}