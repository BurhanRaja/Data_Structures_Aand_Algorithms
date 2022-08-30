package com.Burhan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Breadth_First_Search {
    public static void main(String[] args) {

        int v = 9;

        ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>(v);

        for (int i = 0; i < v; i++) {
            adj.add(new LinkedList<Integer>());
        }

        // Fully Connected Graph

        // addEdge(adj, 0, 1);
        // addEdge(adj, 0, 2);
        // addEdge(adj, 0, 5);
        // addEdge(adj, 1, 3);
        // addEdge(adj, 2, 4);
        // addEdge(adj, 3, 5);
        // addEdge(adj, 4, 5);
                
        // addEdge(adj, 0, 1);
        // addEdge(adj, 0, 2);
        // addEdge(adj, 2, 3);
        // addEdge(adj, 2, 4);

        // addEdge(adj, 0, 1);
        // addEdge(adj, 0, 2);
        // addEdge(adj, 1, 3);
        // addEdge(adj, 1, 2);
        // addEdge(adj, 2, 3);
        // addEdge(adj, 2, 4);
        // addEdge(adj, 3, 4);
        
        // Disconnect Graphs
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        // 
        addEdge(adj, 3, 4);
        //
        addEdge(adj, 5, 6);
        addEdge(adj, 5, 7);
        addEdge(adj, 7, 8);


        // bfs(adj); // Naive
        // bfs1(adj, v, 0); // Efficient
        // Traversal for Disconnected
        bfsDis(adj, v);

    }

    // BFS for undirected and fully connected Graph
    // {{{

    // Naive
    static void bfs(ArrayList<LinkedList<Integer>> adj) {
        ArrayList<Integer> q = new ArrayList<>();

        for (int i = 0; i < adj.size(); i++) {
            if (q.contains(i)) {
                continue;
            } else {
                q.add(i);
            }
            for (int j = 0; j < adj.get(i).size(); j++) {
                if (q.contains(adj.get(i).get(j))) {
                    continue;
                } else {
                    q.add(adj.get(i).get(j));
                }
            }
        }
        System.out.print(q);
    }

    // Efficient
    static void bfs1(ArrayList<LinkedList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int n : adj.get(curr)) {
                if (visited[n] == false) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }
    // }}}


    // BFS for Undirected and no source given & graph may be disconnected.
    // Solution

    // Time Complexity = O(V+E) E is no of edge of the undirected graph i.e. 2*E & directed graph i.e. E and v is the no of vertex in the graph. 
    static void bfsDis(ArrayList<LinkedList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        int count = 0; // No of island in graph - Question
        for (int i = 0; i < v; i++) { // v in time complexity because of this traversal
            if (visited[i] == false) {
                bfs2(adj, i, visited);
                count++; // No of island in graph - Question
            }
        }

        System.out.println();
        System.out.print("No of connected Graph is" + " = " + count); // No of island in graph - Question
    }   
    static void bfs2(ArrayList<LinkedList<Integer>> adj, int s, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int n : adj.get(curr)) { // E in time complexity because of this traversal
                if (visited[n] == false) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    // Adjacency List
    static void addEdge(ArrayList<LinkedList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
