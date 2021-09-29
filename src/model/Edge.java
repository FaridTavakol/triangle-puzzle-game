package model;

public class Edge {
	/* Constructor */
	Edge(Node node1, Node node2, int idx, String color)
	{
		this.node1 = node1;
		this.node2 = node2;
		this.idx = idx;
		this.color = color;
		this.initColor = color;
	}

	/* Attributes */
	public Node node1;
	public Node node2;
	public String color; // the color representation of the edge
	private final String initColor; // initial starting color
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

	// Method to return the color of the edge
	public String getColor()
	{
		return color;
	}

	// Method to return the color of the edge
	public void setColor(String s)
	{
		this.color = s;
	}

	// Method to check whether a given pair of node indexes belong to a given edge
	public int belongToEdge(int[] node_idx)
	{
		if (node1.getNodeIdx() == node_idx[0] && node2.getNodeIdx() == node_idx[1]
				|| node1.getNodeIdx() == node_idx[1] && node2.getNodeIdx() == node_idx[0])
		{

			return this.idx;
		}
		// In case it does not belong to the edge
		else
		{
			return -1;
		}

	}

	public void setInitialColor()
	{
		this.color = this.initColor;
	}

}
