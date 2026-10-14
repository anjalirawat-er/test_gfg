class Solution {
    int maxProduct(int[] arr) {
        // code here
        int max = arr[0];
        int maxProd = arr[0];
        int minProd = arr[0];
        for(int i = 1; i < arr.length; i++){
            int tMax = Math.max(maxProd*arr[i], Math.max(minProd*arr[i], arr[i]));
            int tMin = Math.min(maxProd*arr[i], Math.min(minProd*arr[i], arr[i]));
            maxProd = tMax;
            minProd = tMin;
            max = Math.max(max, tMax);
        }
        return max;
    }
}