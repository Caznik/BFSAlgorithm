package main;

import java.util.List;
import java.util.Scanner;

import algorithms.BFSAlgorithm;
import models.Graph;

public class BfsAlgorithmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Numero total de queries: ");
        int queries = scanner.nextInt();

        for (int q = 0; q < queries; q++) {
        	System.out.print("Numero de nodos: ");
            int n = scanner.nextInt();
            
            System.out.print("Numero de aristas: ");
            int m = scanner.nextInt();
            Graph graph = new Graph(n);

            // Lee las m aristas y las añade al grafo
            for (int i = 0; i < m; i++) {
            	System.out.print("Nodo 1 de arista " + (i+1) + ": ");
                int u = scanner.nextInt() - 1;
                
                System.out.print("Nodo 2 de arista " + (i+1) + ": ");
                int v = scanner.nextInt() - 1;
                graph.addEdge(u, v);
            }

            System.out.print("Nodo de inicio: ");
            int start = scanner.nextInt() - 1;
            List<Integer> distances = BFSAlgorithm.bfsDistances(graph, start); // Calcula las distancias

            // Imprime las distancias excluyendo el nodo de inicio
            for (int i = 0; i < distances.size(); i++) {
                System.out.print(distances.get(i));
                if (i < distances.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Nueva línea para la siguiente consulta
        }

        scanner.close();
    }
}


