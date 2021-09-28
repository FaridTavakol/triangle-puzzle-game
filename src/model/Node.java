package model;

public class Node {
	/* Constructor */
	public Node(int node_idx, int[] friendNodes_idx)// , double[] centerCoordinates)
	{
		idx = node_idx;
		state = false;
		friendNodeArray = new int[friendNodes_idx.length];
		friendNodeArray = friendNodes_idx;

//		x = centerCoordinates[0];
//		y = centerCoordinates[1];

	}

	/* Attributes */

	// Zero means unselected, One means selected node
	public boolean state;
	// coordinates of the node
//	double x;
//	double y;

	// index number for the node
	int idx;
	// Each node has two friend node which is connected to it by an Edge
	int[] friendNodeArray;

	/* Methods */
	// Method to return idx list of friend nodes
	public int[] getFriendNodeIdxList()
	{
		return friendNodeArray;
	}

	// Method to return idx of a specific friend node
	public int getFriendNodeIdx(int num)
	{
		return friendNodeArray[num];
	}

	// Method to get node idx
	public int getNodeIdx()
	{
		return idx;
	}

	// Method to set node state
	public void setNodeState(boolean s)
	{
		this.state = s;
	}

	// Method to get node state
	public boolean getNodeState()
	{
		return this.state;
	}

	// Given a node index checks whether the node is adjacent to the current node or
	// not
	public boolean adjacentNode(int idx)
	{
		boolean result = false;
		System.out.println("Length is:");
		System.out.print(friendNodeArray.length);
		System.out.println("");
		for (int i = 0; i < friendNodeArray.length; i++)
		{
			if (friendNodeArray[i] == idx)
			{
				result = true;
				break;
			}
		}
		System.out.println("result is :");
		System.out.print(result);

		return result;
	}

	// Returning the x and y coordinates of center of each node
//	public double getXCoordinates()
//	{
//		return x;
//	}
//
//	public double getYCoordinates()
//	{
//		return y;
//	}
}
