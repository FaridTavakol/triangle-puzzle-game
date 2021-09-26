package main;

import boundary.TrianglePuzzleApp;
import model.Model;
import model.TrianglePuzzle;

public class Main {

	public static void main(String[] args)
	{

		Model m = new Model();
		TrianglePuzzle tp = new TrianglePuzzle();

		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m, tp);
		tpa.setVisible(true);
//	
	}
}
