class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        Set<Integer> st = new TreeSet<>();
        for(int num :a){
            st.add(num);
        }
        for(int num:b){
            st.add(num);
        }
        return new ArrayList<>(st);
    }
}
