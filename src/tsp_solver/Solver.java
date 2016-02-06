package tsp_solver;

import graph.Graph;
import graph.Vertex;

import java.util.ArrayList;

public class Solver {
	
	private int totalCost;
	private ArrayList<Vertex> currentPath = new ArrayList<Vertex>();
	private Graph g;
	
	public Solver(Graph g) {
		this.g = g;	
	}
	
	public void calculateShortestPathStartingFrom(int startPoint) {

		totalCost = 0;
		currentPath.removeAll(currentPath);
		
		currentPath.add(g.getVertices().get(startPoint));
		
		while(currentPath.size() < g.getVertices().size()) {
			currentPath.add(findNearestNeighbor(currentPath.get(currentPath.size() - 1), currentPath));	
		}
		
		for(int i = 0; i < currentPath.get(currentPath.size() - 1).edges.size(); i++){
			if(currentPath.get(currentPath.size() - 1).edges.get(i).getTo() == g.getVertices().get(startPoint)){
				totalCost += (currentPath.get(currentPath.size() -1).edges.get(i).getWeight());
			}
		}
		currentPath.add(g.getVertices().get(startPoint));
		
		outputPath();
}
	
	private Vertex findNearestNeighbor(Vertex currentVertex, ArrayList<Vertex> path){
		int weight = Integer.MAX_VALUE;
		Vertex smallest = null;
		for(int i = 0; i < currentVertex.edges.size(); i++) {
			if(currentVertex.edges.get(i).getWeight() <= weight && findDuplicate(path, currentVertex.edges.get(i).getTo()) == false) {
				weight = currentVertex.edges.get(i).getWeight();
				smallest = currentVertex.edges.get(i).getTo();
			} 
		}
		totalCost += weight;
		return smallest;
	}
	
	private boolean findDuplicate(ArrayList<Vertex> list, Vertex v) {
		
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getName() == v.getName()){
				return true;
			}
		}
		return false;
	}
	
	private void outputPath() {
		for(Vertex v : currentPath){
			System.out.print(v.getName() + " -> ");
		}
		System.out.println("Total cost: " + totalCost);
	}

	public int getTotalCost() {
		return totalCost;
	}

	public ArrayList<Vertex> getCurrentPath() {
		return currentPath;
	}
	
}
