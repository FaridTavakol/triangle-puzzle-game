package main;

import boundary.TrianglePuzzleApp;
import model.Model;

public class Main {

	public static void main(String[] args)
	{

		Model m = new Model();

		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m);
		tpa.setVisible(true);
	}
}
