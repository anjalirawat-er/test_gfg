class Solution {
    public int maxDiffSubArrays(int[] arr) {
        int n = arr.length;
        
        int[] leftMax = new int[n];
        int[] leftMin = new int[n];
        
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        int minSoFar = arr[0], minEndingHere = arr[0];
        leftMax[0] = arr[0];
        leftMin[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            leftMax[i] = maxSoFar;
            
            minEndingHere = Math.min(arr[i], minEndingHere + arr[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
            leftMin[i] = minSoFar;
        }
        
        int[] rightMax = new int[n];
        int[] rightMin = new int[n];
        
        maxSoFar = arr[n - 1]; maxEndingHere = arr[n - 1];
        minSoFar = arr[n - 1]; minEndingHere = arr[n - 1];
        rightMax[n - 1] = arr[n - 1];
        rightMin[n - 1] = arr[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            rightMax[i] = maxSoFar;
            
            minEndingHere = Math.min(arr[i], minEndingHere + arr[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
            rightMin[i] = minSoFar;
        }
        
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int diff1 = Math.abs(leftMax[i] - rightMin[i + 1]);
            int diff2 = Math.abs(leftMin[i] - rightMax[i + 1]);
            maxDiff = Math.max(maxDiff, Math.max(diff1, diff2));
        }
        
        return maxDiff;
    }
}