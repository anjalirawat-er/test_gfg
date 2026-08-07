class Solution {
    int middle(int a, int b, int c) {
        // code here
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (a + b + c) - max - min;   
    }
}