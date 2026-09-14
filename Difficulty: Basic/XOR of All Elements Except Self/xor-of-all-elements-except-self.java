import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getXor(int[] arr) {
        int totalXor = 0;
        for (int num : arr) {
            totalXor ^= num;
        }

        ArrayList<Integer> res = new ArrayList<>(arr.length);
        for (int num : arr) {
            res.add(totalXor ^ num);
        }

        return res;
    }
}