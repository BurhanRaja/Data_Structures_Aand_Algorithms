package com.Burhan;

import java.util.ArrayList;
import java.util.LinkedList;

public class Adjacency_List {
    public static void main(String[] args) {
        
        int v= 5;
        
        ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>(v);
        
        for (int i = 0; i < v; i++) {
            adj.add(new LinkedList<Integer>());
        }
        
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);

        printGraph(adj);
    }
    static void addEdge(ArrayList<LinkedList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<LinkedList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}