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
			nodeHandler.getMiddleNode(activeNodes);
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

}
