package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import models.Graph;

public class BFSAlgorithm {

	// Método para realizar BFS y calcular las distancias desde el nodo de inicio
	public static List<Integer> bfsDistances(Graph graph, int start) {
		int[] distances = new int[graph.getNumNodes()];
		Arrays.fill(distances, -1); // Inicializa todas las distancias a -1
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		distances[start] = 0; // La distancia desde el nodo de inicio a sí mismo es 0

		while (!queue.isEmpty()) {
			int current = queue.poll();
			int currentDistance = distances[current];

			for (int neighbor : graph.getAdjList().get(current)) {
				if (distances[neighbor] == -1) { // Si el vecino no ha sido visitado
					distances[neighbor] = currentDistance + 6; // Actualiza la distancia
					queue.add(neighbor);
				}
			}
		}

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < graph.getNumNodes(); i++) {
			if (i != start) {
				result.add(distances[i]);
			}
		}

		return result;

	}
}
