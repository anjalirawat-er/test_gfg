class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        if(s.length() == 0) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("");
        return al;
    }
    ArrayList<String> al = powerSet(s.substring(1));
    int l = al.size();
    for(int i = 0; i < l; i++) {
         al.add(s.substring(0, 1) + al.get(i));
    }
    return al;
  }
}
