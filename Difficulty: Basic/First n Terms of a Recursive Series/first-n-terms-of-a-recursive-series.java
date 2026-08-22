class Solution {
    public ArrayList<Integer> gfSeries(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        if (n >= 1) {
            list.add(0);  // T1
        }
        if (n >= 2) {
            list.add(1);  // T2
        }

        for (int i = 3; i <= n; i++) {
            int term = list.get(i - 3) * list.get(i - 3) - list.get(i - 2);
            list.add(term);
        }

        return list;
    }
}