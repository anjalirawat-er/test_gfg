class Solution {
    int maxLength(int arr[]) {
        // code here
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxi= Math.max(maxi,i+1);
            }
            else if(map.containsKey(sum)){
                maxi= Math.max(maxi,i-map.get(sum));

            }
            else{
                map.put(sum,i);
            }
        }
        return maxi;
    }
}