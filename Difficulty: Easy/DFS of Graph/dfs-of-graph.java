class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
            int V = adj.size();   
            boolean[] visited = new boolean[V];
            ArrayList<Integer> result = new ArrayList<>();
            dfsHelper(0, adj, visited, result);
            return result;
        }
        public void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj,
                               boolean[] visited, ArrayList<Integer> result) {

            visited[node] = true;
            result.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    dfsHelper(neighbor, adj, visited, result);
                }
            }
    }
}