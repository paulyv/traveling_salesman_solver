package graph;

import java.util.Scanner;

import tsp_solver.Solver;


public class Main {
		
	public static void main(String[] args) {
		
		
		Graph g = new Graph();
		
		Scanner scanner = new Scanner(System.in);
		
		String vertexName;
		int vertexNum = 0;
		
		System.out.println("Insert names for vertices. Empty name will stop adding.");
		
		// Add vertices to the graph
		do {
			System.out.print("Vertex #" + vertexNum + " : ");
			vertexName = scanner.nextLine();
			
			if (vertexName.length() > 0){
				g.addVertex(vertexName);
			}
			vertexNum++;
			
		} while (vertexName.length() > 0);

		int numVertices = g.getVertices().size();
		System.out.println("Vertices added: " + numVertices);
		
		
		// number of edges = n * (n - 1) / 2
		int numEdges = g.getVertices().size() * (g.getVertices().size() - 1) / 2;
		
		// Add edges and weights
		for(int i = 0; i < numEdges; i++) {
			for(int j = (1 + i); j < numVertices; j++){

				System.out.print("Give weight for " + g.getVertices().get(i).getName() + " -> " + g.getVertices().get(j).getName() + " : ");
				int weight = scanner.nextInt();
				g.addEdge(i, j, weight);
			}
		}
		

		Solver s = new Solver(g);
		
		// Start from every vertex to find all routes and the overall cheapest route.
		for(int i = 0; i < g.getVertices().size(); i++) {
			s.calculateShortestPathStartingFrom(i);
		}
		
		scanner.close();
	}
}
