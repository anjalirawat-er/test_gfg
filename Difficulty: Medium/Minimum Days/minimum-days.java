class Solution {
    public int getMinimumDays(String s, int[] p) {
        // code here

        int n = s.length();
        char[] arr = s.toCharArray();

        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                cnt++;
            }
        }

        if (cnt == 0) {
            return 0;
        }

        for (int day = 0; day < n; day++) {
            int idx = p[day];

            if (idx > 0 && arr[idx] != '?' && arr[idx] == arr[idx - 1]) {
                cnt--;
            }

            if (idx < n - 1 && arr[idx] != '?' && arr[idx] == arr[idx + 1]) {
                cnt--;
            }

            arr[idx] = '?';

            if (cnt == 0) {
                return day + 1;
            }
        }

        return 0;

    }
}