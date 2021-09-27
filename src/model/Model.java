package model;

public class Model {

	// Constructor
	public Model()
	{
		trianglePuzzle = new TrianglePuzzle();
		score = 0;
		bonusScore = 30;
	}

	/* Attributes */
	static int score;
	TrianglePuzzle trianglePuzzle;
	private final int bonusScore;
	public Edge edge;

	/* Methods */
	public TrianglePuzzle getPuzzle()
	{
		return trianglePuzzle;
	}

	public void setScore(int scoreValue)
	{
		score = scoreValue;
	}

	public void bonusScoreIncrease()
	{
		score += bonusScore;
	}

}
