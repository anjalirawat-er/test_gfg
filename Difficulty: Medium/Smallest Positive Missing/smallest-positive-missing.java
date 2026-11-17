class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==count){
                count++;
            }
        }
        return count;
    }
}
