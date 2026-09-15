class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer>ans = new HashMap<>();
        int max =0;
        int sum =0;
          ans.put(0,-1);
        for(int  i=0;i<arr.length;i++){
            sum+=arr[i];
            //if(sum == k) max = i+1;

            if(ans.containsKey(sum-k)){
                max = Math.max(max , i-ans.get(sum-k));
            }
            ans.putIfAbsent(sum,i);
        }
        return max;
    }
}
