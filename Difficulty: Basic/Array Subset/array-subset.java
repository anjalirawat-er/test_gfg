
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        int n=a.length;
        int m = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0 , j=0 ; 

        while(i<n && j<m){
           if (a[i] < b[j]) {
               i++;
           } else if (a[i] == b[j]) {
               i++;
               j++;
           } else {
               return false;
           }
        }

        return j==m;
    }
}
