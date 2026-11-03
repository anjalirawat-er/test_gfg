class Solution { 
    int ans;
    private int root(int i, int[] parent) {
        while (parent[i] != i) {

            parent[i] = parent[parent[i]];

            i = parent[i];
        }
        return i;
    }

    private void union(int a, int b, int[] parent, int[] sz) {

        int u = root(a, parent);
        int v = root(b, parent);
        if (u == v) return;
        if (sz[u] < sz[v]) {

            int temp = u;
            u = v;
            v = temp;
        }

        ans += sz[u] * sz[v];
        parent[v] = u;
        sz[u] += sz[v];

    }



    ArrayList<Integer> maximumWeight(int n, int edges[][], int queries[]) {

        ans = 0;
        int[] parent = new int[n + 1];
        int[] sz = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            sz[i] = 1;
        }

        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));
        int q = queries.length;

        int[][] sortedQueries = new int[q][2];

        for (int i = 0; i < q; i++) {

            sortedQueries[i][0] = queries[i]; 
            sortedQueries[i][1] = i; 

        }

        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));
        Integer[] resArray = new Integer[q];
        int edgeIdx = 0;

        for (int i = 0; i < q; i++) {
            int maxWeightAllowed = sortedQueries[i][0];
            int originalIdx = sortedQueries[i][1];
            while (edgeIdx < n - 1 && edges[edgeIdx][2] <= maxWeightAllowed) {
                union(edges[edgeIdx][0], edges[edgeIdx][1], parent, sz);
                edgeIdx++;
            }
            resArray[originalIdx] = ans;
        }

        ArrayList<Integer> res = new ArrayList<>();
        Collections.addAll(res, resArray);
        return res;

    }

}