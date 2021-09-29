package controllers;

import boundary.TrianglePuzzleApp;
import model.Model;

public class SwapEdgeController {
	public Model model;
	public TrianglePuzzleApp trianglePuzzleApp;
	public NodeHandler nodeHandler;

	public SwapEdgeController(Model m, TrianglePuzzleApp tpa, NodeHandler nh)
	{
		this.model = m;
		this.trianglePuzzleApp = tpa;
		this.nodeHandler = nh;

	}

	public void SwapEdge()
	{
		if (trianglePuzzleApp.getActiveNodes() != 3)
		{
			return;
		}
		int result = nodeHandler.checkNodeAdjacency();
		// action not possible
		if (result == 0)
		{
			System.out.println("Action not possible");

		}
		// Action is possible Regular case
		else if (result == 1)
		{

			int[] activeNodes = new int[3];
			activeNodes = nodeHandler.getActiveNodes();
			int middleNode = nodeHandler.getMiddleNode(activeNodes);
			// Loop forms two arrays of size two corresponding the indexes of the nodes of
			// the active two edges
			int[][] edgeIdx = new int[2][2];
			for (int i = 0, j = 0; i < activeNodes.length; i++)
			{
				if (activeNodes[i] != middleNode)
				{
					edgeIdx[j][1] = activeNodes[i];
					edgeIdx[j][0] = middleNode;
					j++;
				}
			}

			// Loop through edges to find matches for the edges ready for swap
			int[] edgePair = new int[2];
			for (int i = 0, j = 0; i < model.getPuzzle().getNumberOfEdges(); i++)
			{
				for (int ii = 0; ii < 2; ii++)
				{
					if (model.getPuzzle().edge[i].belongToEdge(edgeIdx[ii]) != -1)
					{
						edgePair[j] = model.getPuzzle().edge[i].belongToEdge(edgeIdx[ii]);
						j++;
					}

				}

			}
			swapColor(edgePair);

			// Find the node in the middle based on this I can create two arrays of idx of
			// size two corresponding to edges and then change their color

			System.out.println("Action is possible Regular case!");
		}
		// Action is possible Special case
		else if (result == 2)
		{
			int[] activeNodes = new int[3];
			activeNodes = nodeHandler.getActiveNodes();
			System.out.println("Action is possible Special case");
		}
	}

	public void swapColor(int[] edgePair)
	{

		String color = new String();
		color = model.getPuzzle().edge[edgePair[1]].getColor();
		model.getPuzzle().edge[edgePair[1]].setColor(model.getPuzzle().edge[edgePair[0]].getColor());
		model.getPuzzle().edge[edgePair[0]].setColor(color);

	}

}
