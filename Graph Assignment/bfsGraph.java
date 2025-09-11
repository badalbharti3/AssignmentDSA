import java.util.*;
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        boolean[] vis = new boolean[adj.size()];
        
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for(int n: adj.get(curr)){
                if(!vis[n]){
                    q.add(n);
                    vis[n] = true;
                }
            }
        }
        return res;
    }
}
public class bfsGraph{
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 1}, {0}, {0, 4}, {0}, {2}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> n = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                n.add(arr[i][j]);
            }
            adj.add(n);
        }
        Solution obj = new Solution();
        ArrayList<Integer> res = obj.bfs(adj);
        // Print BFS result
        System.out.println("BFS Traversal: " + res);
    }
}