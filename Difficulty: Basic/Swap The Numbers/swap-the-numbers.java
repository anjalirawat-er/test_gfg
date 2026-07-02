class Solution {
    public void swap(int a, int b) {
        // code here
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(a + " " + b);
    }
}
