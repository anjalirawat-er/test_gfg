class Solution {
    public String computeParity(int n) {
        // code here
        int bits=0;
        while(n>0){
            if((n&1)==1){
                bits++;
            }
            n=n>>1;
        }
        if(bits%2==0){
            return "even";
        }else{
            return "odd";
        }    
    }
}