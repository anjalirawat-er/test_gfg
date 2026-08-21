class Solution {
    ArrayList<Integer> ans = new ArrayList<>();

    void peeche(int n) {
        ans.add(n);
        if(n <= 0) return;
        peeche(n - 5);
    }
    void aage(int n,int og) {
        if(n >= og) return;
        ans.add(n);
        aage(n + 5, og);
    }
    public ArrayList<Integer> pattern(int n) {
        // code here
        peeche(n);
        aage(ans.get(ans.size() - 1) + 5, n);

        if(ans.get(ans.size() - 1) != n) {
            ans.add(n);
        }
        return ans;
    }
}