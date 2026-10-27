class Solution {
    public int findPages(int[] arr, int k) {
        // code here
           int n = arr.length;
            if (k > n) {
                return -1;
            }
            long low = 0;
            long high = 0;
            for (int pages : arr) {
                low = Math.max(low, pages);
                high += pages;
            }
            long answer = high;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (ispossible(arr, k, mid)) {
                   answer = mid;
                   high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return (int) answer;
        }
        static boolean ispossible(int[] arr, int k, long maxpages) {
            int student = 1;
            long curpages = 0;
            for (int pages : arr) {
                if (curpages + pages > maxpages) {
                    student++;
                    curpages = pages;
                    if (student > k) {
                       return false; 
                    }
                }
                else {
                    curpages += pages;
                }
            }
            return true; 
    }
}