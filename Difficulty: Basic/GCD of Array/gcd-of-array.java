class Solution {
    public int gcd(int n, int arr[]) {
       int gcd=arr[0];
       
       for(int i=0;i<n-1;i++){
           gcd=gcd(gcd,arr[i+1]);
       }
       return gcd;
    } 
    static int gcd(int a,int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
}