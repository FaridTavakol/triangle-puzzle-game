package controllers;

import model.TrianglePuzzle;

public class NodeHandler {
//	Model model;
	/* Attributes */
	public TrianglePuzzle trianglePuzzle;

	public enum node_names {
		tglbtn1, tglbtn2, tglbtn3, tglbtn4, tglbtn5, tglbtn6, tglbtn7, tglbtn8, tglbtn9, tglbtn10
	};

	/* Constructor */
	public NodeHandler(TrianglePuzzle tp)
	{

		this.trianglePuzzle = tp;
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
				if (!trianglePuzzle.node[idx].getNodeState())
				{
					trianglePuzzle.node[idx].setNodeState(true);
					System.out.println("state of the node changed to:");
					System.out.println(trianglePuzzle.node[idx].getNodeState());
				} else if (trianglePuzzle.node[idx].getNodeState())
				{
					trianglePuzzle.node[idx].setNodeState(false);
					System.out.println("state of the node changed to:");
					System.out.println(trianglePuzzle.node[idx].getNodeState());
				}

			}

		}

	}
}
