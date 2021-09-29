package controllers;

import boundary.TrianglePuzzleApp;
import model.Model;

public class ResetController {

	TrianglePuzzleApp app;
	Model model;

	public ResetController(Model m, TrianglePuzzleApp app)
	{
		this.model = m;
		this.app = app;
	}

	public void process()
	{
		model.resetWon();
		UnselectNodesController unselectNodesCtrl = new UnselectNodesController(model, app);
		unselectNodesCtrl.unselectAllNodes();
		// It should return value of 0
		model.getPuzzle().resetTrianglePuzzle();
		model.resetNumberOfMoves();
		model.resetPlayerScore();
		model.resetPlayerScore();

		app.getNumberOfMoves().setText("" + model.getNumberOfMoves());
		app.getScore().setText("" + model.getScore());

		app.contentPane.repaint();

	}
}
