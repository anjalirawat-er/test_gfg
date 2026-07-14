
class Solution {
    public String average(int arr[]) {
        // code here
        int ans =0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        double x=(double)ans/arr.length;
        return String.format("%.2f",x);
    }
}