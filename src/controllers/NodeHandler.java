package controllers;

import model.Model;

public class NodeHandler {
//	Model model;
	/* Attributes */
	public Model model;

	public enum node_names {
		tglbtn1, tglbtn2, tglbtn3, tglbtn4, tglbtn5, tglbtn6, tglbtn7, tglbtn8, tglbtn9, tglbtn10
	};

	/* Constructor */
	public NodeHandler(Model m)
	{

		this.model = m;
	}

	/* Methods */
	// Changes the state of the node upon an action performed on a node
	public void setNodeState(String s)
	{
		for (node_names instance : node_names.values())
		{
			if (s.equals(instance.toString()))
			{
				int idx = node_names.valueOf(s).ordinal();
				if (!model.getPuzzle().node[idx].getNodeState())
				{
					model.getPuzzle().node[idx].setNodeState(true);

				} else if (model.getPuzzle().node[idx].getNodeState())
				{
					model.getPuzzle().node[idx].setNodeState(false);

				}

			}

		}

	}

	// Method which is invoked by the UselectNodesController which changes the state
	// of all nodes to False
	public void setAllNodeStateToFalse()
	{
		for (node_names instance : node_names.values())
		{
			int idx = node_names.valueOf(instance.toString()).ordinal();
			// Changing state of each node to false (Unselected)
			model.getPuzzle().node[idx].state = false;

		}

	}

	public int getNumberOfActiveNodes()
	{
		int activeNodes = 0;
		for (node_names instance : node_names.values())
		{
			int idx = node_names.valueOf(instance.toString()).ordinal();
			// Changing state of each node to false (Unselected)
			if (model.getPuzzle().node[idx].state == true)
			{
				activeNodes++;
			}

		}
		return activeNodes;
	}

	// Node adjacency check
	// Will return 3 scenarios:
	// 0 when the nodes are not adjacent
	// 1 when the nodes are adjacent but do not form a triangle(special case)
	// 2 when all three nodes form a triangle (each node is adjacent with the other
	// two nodes)
	public int checkNodeAdjacency()
	{
		int adjacency = 0;
		// Since when this method is called it is ensured that there are exactly 3 nodes
		// active
		int[] activeNodes = new int[3];

		// Getting active nodes indexes
		activeNodes = getActiveNodes();

		// Checking adjacency logic
		// In the case where the selected nodes form a triangle
		if (model.getPuzzle().node[activeNodes[0]].adjacentNode(activeNodes[1])
				&& model.getPuzzle().node[activeNodes[0]].adjacentNode(activeNodes[2])
				&& model.getPuzzle().node[activeNodes[1]].adjacentNode(activeNodes[2]))
		{
			adjacency = 2;

		}
		// In the case where the selected nodes have a single mutual node
		else if (model.getPuzzle().node[activeNodes[0]].adjacentNode(activeNodes[1])
				&& model.getPuzzle().node[activeNodes[0]].adjacentNode(activeNodes[2])
				|| model.getPuzzle().node[activeNodes[1]].adjacentNode(activeNodes[2])
						&& model.getPuzzle().node[activeNodes[1]].adjacentNode(activeNodes[0])
				|| model.getPuzzle().node[activeNodes[2]].adjacentNode(activeNodes[1])
						&& model.getPuzzle().node[activeNodes[2]].adjacentNode(activeNodes[0]))
		{

			adjacency = 1;
		}

		return adjacency;
	}

	// Method to return Active node indexes
	public int[] getActiveNodes()
	{
		int i = 0;
		int[] activeNodes = new int[3];

		// Method to get active nodes
		for (node_names instance : node_names.values())
		{
			int idx = node_names.valueOf(instance.toString()).ordinal();

			// This loop picks the index of the 3 active nodes
			if (model.getPuzzle().node[idx].state == true)
			{
				activeNodes[i] = idx;
				i++;

			}
		}
		return activeNodes;
	}

	// Method which finds the middle node among the three
	public int getMiddleNode(int[] activeNodes)
	{
		int middleNodeIdx = 0;
		if (model.getPuzzle().node[activeNodes[0]].adjacentNode(activeNodes[1])
				&& model.getPuzzle().node[activeNodes[0]].adjacentNode(activeNodes[2]))
		{
			middleNodeIdx = model.getPuzzle().node[activeNodes[0]].getNodeIdx();

			return middleNodeIdx;
		} else if (model.getPuzzle().node[activeNodes[1]].adjacentNode(activeNodes[2])
				&& model.getPuzzle().node[activeNodes[1]].adjacentNode(activeNodes[0]))
		{
			middleNodeIdx = model.getPuzzle().node[activeNodes[1]].getNodeIdx();

			return middleNodeIdx;
		} else
		{
			middleNodeIdx = model.getPuzzle().node[activeNodes[2]].getNodeIdx();

			return middleNodeIdx;

		}
	}
}
