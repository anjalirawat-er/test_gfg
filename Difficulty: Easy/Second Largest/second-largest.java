class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1;
        int second = first;
        
        for (int e:arr){
            if (e > first){
                second = first;
                first = e;
            }
            if( e != first){
                second = Math.max(e,second);
            }
        }
        
        return second;
    }
}