import java.util.*;
public class dfsGraph {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 1}, {0}, {0, 4}, {0}, {2}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                neighbors.add(arr[i][j]);
            }
            adj.add(neighbors);
        }
        Solution obj = new Solution();
        ArrayList<Integer> res = obj.dfs(adj);
        // Print DFS result
        System.out.println("DFS Traversal: " + res);
    }
}
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, boolean[] vis){
        
        if(vis[node]) return;
        vis[node] = true;
        res.add(node);
        
        for(int n:adj.get(node)){
            if(!vis[n]){
                dfs(n,adj,res,vis);
            }
        }
        
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        int V = adj.size();
        boolean[] vis = new boolean[V];
        
        for(int i=0; i<adj.size();i++){
            dfs(i,adj,res,vis);
        }
        return res;
        
    }
}
