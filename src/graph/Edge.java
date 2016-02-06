package graph;

public class Edge {
	
	private int weight;
	private Vertex from;
	private Vertex to;
	
	public Edge(Vertex from, Vertex to, int weight) {
		this.weight = weight;
		this.from = from;
		this.to = to;

	}

	public int getWeight() {
		return weight;
	}

	public Vertex getFrom() {
		return from;
	}

	public Vertex getTo() {
		return to;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setFrom(Vertex from) {
		this.from = from;
	}

	public void setTo(Vertex to) {
		this.to = to;
	}

}
