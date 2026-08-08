class Solution {
    public static int findMean(int[] arr) {
        // code here
        int mean = 0;
        int l = arr.length;
        for(int i= 0; i< l; i++){
            mean = mean + arr[i];
        }
        return mean/l;
    }
};