class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = arr.length;
        int slow = 0;
        int fast = 1;
        while(n != fast){
            if(arr[slow] != arr[fast]){
                al.add(arr[slow]);
            }
            arr[slow++] = arr[fast];
            fast++;
        }
        al.add(arr[n - 1]);
        return al;
    }
}
