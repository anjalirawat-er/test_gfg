class Solution {
    int majorityElement(int arr[]) {
        // code here
            int n=arr.length;
            if(n==1){
                return arr[0];
            }
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int nums:arr){
             map.put(nums, map.getOrDefault(nums, 0) + 1);
         }
         for (int key : map.keySet()) {
        if (map.get(key) > n / 2) {
            return key;
        }
         }
         return -1;    
        
    }
}