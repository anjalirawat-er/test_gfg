class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
               return new BFS().getBFS(adj, 0);
            }
        }
        class BFS{
            ArrayList<ArrayList<Integer>> adjList;
            Queue<Integer> queue;
            boolean visited[];
            ArrayList<Integer> getBFS(ArrayList<ArrayList<Integer>> adjList,int src){
                this.adjList=adjList;
                initializeBFS(adjList.size(),src);
                return runBFS();
            }
            private void initializeBFS(int nodes,int src){
                queue=new ArrayDeque<>();
                queue.add(src);
                visited=new boolean[nodes];
                visited[src]=true;
            }
            private ArrayList<Integer> runBFS(){
                ArrayList<Integer> bfs=new ArrayList<>();
                while(!queue.isEmpty()){
                    Integer currNode = queue.poll();
                    bfs.add(currNode);
                    processNode(currNode);
                }
                return bfs;
            }
            void processNode(int node){
                for(Integer nextNode:adjList.get(node)){
                    if(!visited[nextNode]){
                        visited[nextNode]=true;
                        queue.add(nextNode);
                    }
                }

            }
        
        }