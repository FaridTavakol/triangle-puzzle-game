package model;

public class Model {

	// Constructor
	public Model()
	{
		trianglePuzzle = new TrianglePuzzle();
		score = 0;
		bonusScore = 30;
		moveCounter = 0;
	}

	/* Attributes */
	static int score;
	TrianglePuzzle trianglePuzzle;
	private final int bonusScore;
	public Edge edge;
	public int moveCounter;

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

	public int getNumberOfMoves()
	{
		return moveCounter;
	}

	public void increaseNumberOfMoves()
	{
		this.moveCounter++;
	}

	public void resetNumberOfMoves()
	{
		moveCounter = 0;
	}

}
