package model;

public class Model {

	// Constructor
	public Model()
	{
		trianglePuzzle = new TrianglePuzzle();
		score = 0;
		bonusScore = 20;
		moveCounter = 0;
		gameWon = false;
	}

	/* Attributes */
	static int score;
	TrianglePuzzle trianglePuzzle;
	private final int bonusScore;
	public Edge edge;
	public int moveCounter;
	private boolean gameWon;

	/* Methods */
	public TrianglePuzzle getPuzzle()
	{
		return trianglePuzzle;
	}

	public void giveBonusScore()
	{
		score += bonusScore;
	}

	public void decreasebonusScore()
	{
		score -= bonusScore;
	}

	public int getNumberOfMoves()
	{
		return moveCounter;
	}

	// In each move the number of move is increased and score is decreased by 1
	public void move()
	{
		this.moveCounter++;
		int oldTriangles = trianglePuzzle.getNumberOfSimilarColorTriangles();
		trianglePuzzle.updateNumberOfSimilarColorTriangles();

		int newTriangles = trianglePuzzle.getNumberOfSimilarColorTriangles();
		gameWon = trianglePuzzle.gameWon();
		score--;
		if (oldTriangles - newTriangles > 1)
		{

			decreasebonusScore();
			decreasebonusScore();

		} else if (oldTriangles - newTriangles == 1)
		{

			decreasebonusScore();

		} else if (newTriangles - oldTriangles > 1)
		{
			giveBonusScore();
			giveBonusScore();

		} else if (newTriangles - oldTriangles == 1)
		{
			giveBonusScore();

		}
		gameWon = trianglePuzzle.gameWon();

	}

	public int getScore()
	{
		return score;
	}

	public void resetNumberOfMoves()
	{
		moveCounter = 0;

	}

	public void resetPlayerScore()
	{
		score = 0;
	}

	public boolean isWon()
	{
		return gameWon;
	}

	public void setWon()
	{
		gameWon = true;
	}

	public void resetWon()
	{
		gameWon = false;
	}

}
