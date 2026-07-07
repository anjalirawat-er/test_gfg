class Solution {
    public int findMin(int a, int b) {
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        
        int minVal = Math.min(add, Math.min(sub, mul));
        
        try {
            int div = a / b;
            minVal = Math.min(minVal, div);
        } catch (ArithmeticException e) {
      }
        
        return minVal;
    }
}