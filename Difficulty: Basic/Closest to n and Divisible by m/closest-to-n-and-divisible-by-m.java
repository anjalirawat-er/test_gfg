class Solution {
    static int closestNumber(int n, int m) {

        m=Math.abs(m);
        int q=n/m;
        int first=m*q;
        int second;
        if(n>=0){
            second=m*(q+1);
        }else{
            second=m*(q-1);
        }
        if(Math.abs(n-first)<Math.abs(n-second)){
            return first;
        }
        else if (Math.abs(n-first)>Math.abs(n-second)){
            return second;
        } 
        else{
            return(Math.abs(first)>Math.abs(second))?first:second;
        }
    }
}