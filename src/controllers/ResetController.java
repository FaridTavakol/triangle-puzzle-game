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
		System.out.println("You clicked Reset!");
	}
}
