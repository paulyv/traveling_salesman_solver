package graph;

import java.util.ArrayList;


public class Vertex {

	private String name;
	public ArrayList<Edge> edges;
	
	public Vertex(String name){
		this.name = name;
		edges = new ArrayList<Edge>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList getEdges(){
		return edges;
	}
	
	public void addEdge(Vertex from, Vertex to, int weight){
		edges.add(new Edge(from, to, weight));
	}
}
