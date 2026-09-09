class Solution {
    public int reverseBits(int n) {
        // code here
    String str=Integer.toBinaryString(n);
       StringBuffer rev=new StringBuffer(str);
       rev.reverse();
       int num=Integer.parseInt(rev.toString(),2);
       return num;    
    }
}