package model;

public class Model {

	TrianglePuzzle trianglePuzzle;

	// Constructor
	Model()
	{
		trianglePuzzle = new TrianglePuzzle();
	}

	/* Attributes */
	static int score;

	/* Methods */
	public TrianglePuzzle getPuzzle()
	{
		return trianglePuzzle;
	}

}