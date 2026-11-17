class Solution {
    public boolean findPattern(String s) {
        // code here
        int curr=0;

        for(char k:s.toCharArray()){
            if(k=='y' && curr==0)
                 return false;
           if(k=='x')
              curr++;
            else
              curr--;
        }
        return curr==0?true:false;
    }
}
