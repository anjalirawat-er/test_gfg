class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                ans.set(st.pop(),arr[i]);
            }
            st.push(i);
        }
        return ans;
    }
}