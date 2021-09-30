package controllers;

import boundary.TrianglePuzzleApp;
import model.Model;

public class UnselectNodesController {
	// Constructor
	public UnselectNodesController(Model m, TrianglePuzzleApp tpa)
	{
		this.model = m;
		this.trianglePuzzleApp = tpa;

	}

	// Attributes
	public TrianglePuzzleApp trianglePuzzleApp;
	public Model model;

	// Methods
	public void unselectAllNodes()

	{

		trianglePuzzleApp.tglbtn1.setSelected(false);
		trianglePuzzleApp.tglbtn2.setSelected(false);
		trianglePuzzleApp.tglbtn3.setSelected(false);
		trianglePuzzleApp.tglbtn4.setSelected(false);
		trianglePuzzleApp.tglbtn5.setSelected(false);
		trianglePuzzleApp.tglbtn6.setSelected(false);
		trianglePuzzleApp.tglbtn7.setSelected(false);
		trianglePuzzleApp.tglbtn8.setSelected(false);
		trianglePuzzleApp.tglbtn9.setSelected(false);
		trianglePuzzleApp.tglbtn10.setSelected(false);
		trianglePuzzleApp.nodeHandler.setAllNodeStateToFalse();
	}

}
