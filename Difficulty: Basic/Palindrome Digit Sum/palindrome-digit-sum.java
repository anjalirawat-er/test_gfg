class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while(n>0){
            sum +=n % 10;
            n/=10;
        }
        
        int original=sum;
        int rev=0;
        while (sum>0){
            rev = rev*10 + sum%10;
            sum/=10;
        }
        
        return original==rev;
    }
}