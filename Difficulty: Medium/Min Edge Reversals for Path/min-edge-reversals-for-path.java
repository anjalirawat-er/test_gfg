class Solution {
    public int minimumEdgeReversal(int[][] edges, int n, int src, int dst) {
        // code here
        ArrayList < ArrayList < int[] >> adj = new ArrayList < > ();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList < int[] > ());
        for (int[] i: edges) {
            int a = i[0];
            int b = i[1];
            adj.get(a).add(new int[] {b,0});
            adj.get(b).add(new int[] {a,1});
        }
        PriorityQueue < int[] > pq;
        pq = new PriorityQueue < > ((o1, o2)-> o1[1] - o2[1]);
        boolean[] visited = new boolean[n+1];
        int ans = 0;
        //Dijkstra algo
        pq.add(new int[] {src, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.remove();
            int currWeight = curr[1];
            int currEle = curr[0];
            if(currEle==dst) return currWeight;
            if (!visited[currEle]) {
                visited[currEle] = true;
                for (int[] i: adj.get(currEle)) {
                    int nebEle = i[0];
                    int nebWeight = i[1];
                    if (!visited[nebEle]) {
                        pq.add(new int[] {nebEle,currWeight + nebWeight});
                    }
                }
            }
        }
        return -1;
    }
}