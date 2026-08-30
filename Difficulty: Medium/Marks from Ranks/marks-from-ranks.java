import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        int n = l.length;
        long[] prefixCount = new long[n];

        prefixCount[0] = r[0] - l[0] + 1;
        for (int i = 1; i < n; i++) {
            prefixCount[i] = prefixCount[i - 1] + (r[i] - l[i] + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int k : rank) {
            int low = 0, high = n - 1;
            int intervalIdx = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (prefixCount[mid] >= k) {
                    intervalIdx = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            long prevTotal = (intervalIdx > 0) ? prefixCount[intervalIdx - 1] : 0;
            long offset = k - prevTotal;

            int mark = (int) (l[intervalIdx] + (offset - 1));
            result.add(mark);
        }

        return result;
    }
}