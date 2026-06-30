import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.lastDigit(n));
    }
}

class Solution {
    public int lastDigit(int n) {
        return Math.abs(n) % 10;
    }
}