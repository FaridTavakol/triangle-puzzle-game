package model;

public class Edge {
	/* Constructor */
	Edge(Node node1, Node node2, int idx, String color)
	{
		this.node1 = node1;
		this.node2 = node2;
		this.idx = idx;
		this.color = color;
	}

	/* Attributes */
	public Node node1;
	public Node node2;
	public String color; // the color representation of the edge
	public int idx; // index for each edge

	/* Methods */
	public void setEdgeColor(String s)
	{
		this.color = s;
	}

	public int[] getNodeIdx()
	{
		int[] nodeIdx = new int[2];
		nodeIdx[0] = node1.getNodeIdx();
		nodeIdx[1] = node2.getNodeIdx();
		return nodeIdx;
	}

	public int getEdgeIdx()
	{
		return idx;
	}

	public String getColor()
	{
		return color;
	}

}
