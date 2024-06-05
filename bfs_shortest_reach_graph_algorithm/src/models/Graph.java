package models;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<List<Integer>> adjList; // Lista de adyacencia para representar el grafo
	private int numNodes; // Número de nodos en el grafo

	// Constructor que inicializa el grafo con n nodos
	public Graph(int n) {
		numNodes = n;
		adjList = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	// Método para añadir una arista entre dos nodos u y v
	public void addEdge(int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	public List<List<Integer>> getAdjList() {
		return adjList;
	}

	public void setAdjList(List<List<Integer>> adjList) {
		this.adjList = adjList;
	}

	public int getNumNodes() {
		return numNodes;
	}

	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}	
}