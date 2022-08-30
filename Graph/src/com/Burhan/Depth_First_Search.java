package com.Burhan;

import java.util.ArrayList;
import java.util.LinkedList;

public class Depth_First_Search {
    public static void main(String[] args) {
        int v= 5;
        
        ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>(v);
        
        for (int i = 0; i < v; i++) {
            adj.add(new LinkedList<Integer>());
        }
        
        // addEdge(adj, 0, 1);
        // addEdge(adj, 0, 2);
        // addEdge(adj, 1, 3);
        // addEdge(adj, 1, 4);
        // addEdge(adj, 2, 3);
        // addEdge(adj, 3, 4);


        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        //
        addEdge(adj, 3, 4);
        
        dfs2(adj, v, 0);

    }

    // Fully Connected Directeed Graph
    static void dfsRec(ArrayList<LinkedList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                dfsRec(adj, u, visited);
            }
        }
    }
    static void dfs(ArrayList<LinkedList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v];
        dfsRec(adj, s, visited);
    }

    // Disconnected Undirected Graph
    static void dfs2(ArrayList<LinkedList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v];
        int count = 0; // Count Connected Component
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                dfsRec(adj, i, visited);
                count++;
            }
        }

        System.out.println();
        System.out.print("count of Connected Component = " + count);
    }

    static void addEdge(ArrayList<LinkedList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
