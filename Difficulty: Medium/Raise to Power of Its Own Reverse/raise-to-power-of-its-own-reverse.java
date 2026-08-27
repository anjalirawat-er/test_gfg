class Solution {
    public int reverseExponentiation(int n) {
        // code here
      int copy=n;
      int rev=0;
      while(n>0){
          int digit=n%10;
          rev=rev*10+digit;
          n/=10;
      }
      int sum=(int)Math.pow(copy,rev);
      return sum;
    }
}        
