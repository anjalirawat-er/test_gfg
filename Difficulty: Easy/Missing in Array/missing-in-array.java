class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int i = 0;
        
        Arrays.sort(arr);
        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return i + 1;
            }
        }
        
        return n + 1;
    }
}