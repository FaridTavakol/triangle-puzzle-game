package controllers;

import model.Model;
import model.TrianglePuzzle;

public class NodeHandler {
//	Model model;
	/* Attributes */
	public TrianglePuzzle trianglePuzzle;
	public Model model;

	public enum node_names {
		tglbtn1, tglbtn2, tglbtn3, tglbtn4, tglbtn5, tglbtn6, tglbtn7, tglbtn8, tglbtn9, tglbtn10
	};

	/* Constructor */
	public NodeHandler(Model m)
	{

//		this.trianglePuzzle = tp;
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
					System.out.println("state of the node changed to:");
					System.out.println(model.getPuzzle().node[idx].getNodeState());
				} else if (model.getPuzzle().node[idx].getNodeState())
				{
					model.getPuzzle().node[idx].setNodeState(false);
					System.out.println("state of the node changed to:");
					System.out.println(model.getPuzzle().node[idx].getNodeState());
				}

			}

		}

	}
}
