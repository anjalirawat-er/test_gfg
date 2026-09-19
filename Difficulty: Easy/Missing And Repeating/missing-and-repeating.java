class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> r = new ArrayList<>();

        int n =arr.length;
        int[] freq = new int[n+1];
        int d =0;
        int m =0;
        for(int i =0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i =1;i<=n;i++){
            if(freq[i]==2){
                d=i;
            }
            if(freq[i]==0){
                m=i;
            }
        }
        r.add(d);
        r.add(m);
        return r;
    }
}
