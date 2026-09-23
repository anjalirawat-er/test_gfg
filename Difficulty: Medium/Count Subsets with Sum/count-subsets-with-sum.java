class Solution {
    static int perfectSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];
        dp[0][0]=1;

        for(int i=1; i<=n; i++){
            int pick=0;
            for(int j=0; j<=target; j++){
                if(arr[i-1]<=j){
                    pick = dp[i-1][j-arr[i-1]];
                }
                int notpick = dp[i-1][j];
                dp[i][j] = pick+notpick;
            }
        }
        return dp[n][target];
    }
}