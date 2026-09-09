class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        String res=Integer.toBinaryString(n);
               int count=0,maxCount=0;
               for(int i=0;i<res.length();i++){
                   char ch=res.charAt(i);
                   if(ch=='1'){
                       count++;
                       maxCount=Math.max(count,maxCount);
                   }
                   else{
                       count=0;
                   }
               }
               return maxCount;
    }
}
