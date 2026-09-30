class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        int count = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] inDegree = new int[V];
        
        Arrays.fill(inDegree,0);
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            inDegree[v]++;
        }
        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.offer(i);
                count++;
            }
        }    
        while(!q.isEmpty()){
            int node = q.poll();
            for(int j=0;j<adj.get(node).size();j++){
                inDegree[adj.get(node).get(j)]--;
                if(inDegree[adj.get(node).get(j)]==0){
                    q.offer(adj.get(node).get(j));
                    count++;
                }
            }
        }
        if(count!=V){
            return true;
        }
        return false;
    }
}