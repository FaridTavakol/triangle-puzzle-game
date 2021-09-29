package controllers;

import java.util.Arrays;

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
		// If the game is already won do nothing
		if (model.isWon())
		{
			return;
		}
		// If the number of active nodes are more or less than 3 do nothing
		if (trianglePuzzleApp.getActiveNodes() != 3)
		{
			return;
		}

		int result = nodeHandler.checkNodeAdjacency();
		// action not possible
		if (result == 0)
		{

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
				for (int ii = 0; ii < edgeIdx.length; ii++)
				{
					if (model.getPuzzle().edge[i].belongToEdge(edgeIdx[ii]) != -1)
					{
						edgePair[j] = model.getPuzzle().edge[i].belongToEdge(edgeIdx[ii]);
						j++;
					}

				}

			}
			swapColor(edgePair);
			model.move();
			trianglePuzzleApp.getNumberOfMoves().setText("" + model.getNumberOfMoves());
			trianglePuzzleApp.getScore().setText("" + model.getScore());
			trianglePuzzleApp.repaint();
			// Find the node in the middle based on this I can create two arrays of idx of
			// size two corresponding to edges and then change their color
			UnselectNodesController unselectNodesCtrl = new UnselectNodesController(model, trianglePuzzleApp);
			unselectNodesCtrl.unselectAllNodes();
		}

		// Action is possible Special case
		else if (result == 2)
		{
			int[] activeNodes = new int[3];
			activeNodes = nodeHandler.getActiveNodes();
			// Creating Edges with their corresponding node indexes
			int[][] edgeIdx = new int[3][2];
			edgeIdx[0][0] = activeNodes[0];
			edgeIdx[1][0] = activeNodes[0];
			edgeIdx[0][1] = activeNodes[1];
			edgeIdx[1][1] = activeNodes[2];
			edgeIdx[2][0] = activeNodes[1];
			edgeIdx[2][1] = activeNodes[2];
			int[] edgePair = new int[3];

			// loop to find edges based on their corresponding node indexes
			for (int i = 0, j = 0; i < model.getPuzzle().getNumberOfEdges(); i++)
			{
				for (int ii = 0; ii < edgeIdx.length; ii++)
				{
					if (model.getPuzzle().edge[i].belongToEdge(edgeIdx[ii]) != -1)
					{
						edgePair[j] = model.getPuzzle().edge[i].belongToEdge(edgeIdx[ii]);
						j++;
					}

				}

			}
			swapColorSpecialCase(edgePair);
			model.move();
			trianglePuzzleApp.getNumberOfMoves().setText("" + model.getNumberOfMoves());
			trianglePuzzleApp.getScore().setText("" + model.getScore());
			trianglePuzzleApp.repaint();
			UnselectNodesController unselectNodesCtrl = new UnselectNodesController(model, trianglePuzzleApp);
			unselectNodesCtrl.unselectAllNodes();

		}

	}

	public void swapColor(int[] edgePair)
	{

		String color = new String();
		color = model.getPuzzle().edge[edgePair[1]].getColor();
		model.getPuzzle().edge[edgePair[1]].setColor(model.getPuzzle().edge[edgePair[0]].getColor());
		model.getPuzzle().edge[edgePair[0]].setColor(color);

	}

	public void swapColorSpecialCase(int[] edgePair)
	{
		String[] color = new String[edgePair.length];

		// sorting index list
		Arrays.sort(edgePair);

		for (int i = 0; i < edgePair.length; i++)
		{

			color[i] = model.getPuzzle().edge[edgePair[i]].getColor();
		}

		model.getPuzzle().edge[edgePair[0]].setColor(color[2]);
		model.getPuzzle().edge[edgePair[1]].setColor(color[0]);
		model.getPuzzle().edge[edgePair[2]].setColor(color[1]);

	}

}
