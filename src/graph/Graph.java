package graph;

import java.util.ArrayList;

public class Graph {
	
	private ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	
	public void addVertex(String name) {
		vertices.add(new Vertex(name));
	}
	
	public void addEdge(int from, int to, int weight) {
		vertices.get(from).addEdge(vertices.get(from), vertices.get(to), weight);
		vertices.get(to).addEdge(vertices.get(to), vertices.get(from), weight);	
	}
	
	public void outputGraph() {
		for(int i = 0; i < vertices.size(); i++) {
			System.out.println(vertices.get(i).getName() + ":");
			for(int j = 0; j < vertices.get(i).edges.size(); j++) {
				System.out.print(vertices.get(i).edges.get(j).getFrom().getName() + " - " + vertices.get(i).edges.get(j).getTo().getName() + " " + vertices.get(i).edges.get(j).getWeight() + "\n");
			}
			System.out.println();
		}
	}

	public ArrayList<Vertex> getVertices() {
		return vertices;
	}
}
