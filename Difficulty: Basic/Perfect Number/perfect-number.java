class Solution {
    int isPerfect(int N) {
        int sum=0;
        int temp=N;
        while(N>0)
        {
            int digit=N%10;
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact*=i;
            }
            sum+=fact;
            N=N/10;
        }
        return (temp==sum) ? 1:0;
    }
}