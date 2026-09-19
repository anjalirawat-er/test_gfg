class Solution {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0 , prefixSum = 0;
        for(int i : arr) totalSum += i;
        for(int i = 0 ; i < arr.length ; i++){
            int suffixSum = totalSum - prefixSum - arr[i];
            if(suffixSum == prefixSum) return i;
            prefixSum = prefixSum + arr[i];
        }
        return -1;
    }
}
