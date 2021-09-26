package model;

public class Node {
	/* Constructor */
	Node(int node_idx, int[] friendNodes_idx)
	{
		idx = node_idx;
		state = false;
		friendNodeArray = new int[friendNodes_idx.length];
		friendNodeArray = friendNodes_idx;
	}

	/* Attributes */

	// Zero means unselected, One means selected node
	public boolean state;
	// coordinates of the node
	double x;
	double y;

	// index number for the node
	int idx;
	// Each node has two friend node which is connected to it by an Edge
	int[] friendNodeArray;

	/* Methods */
	// Method to return idx's of friend nodes
	int[] getFriendNodeIdx()
	{
		return friendNodeArray;
	}

	// Method to get node idx
	int getNodeIdx()
	{
		return idx;
	}

	// Method to set node state
	void setNodeState(boolean s)
	{
		this.state = s;
	}

	// Method to get node state
	boolean getNodeState()
	{
		return this.state;
	}

}
