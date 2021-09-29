package model;

public class Triangle {
	public Edge[] edge = new Edge[3];
	private int idx;
	private String winningColor;

	Triangle(int idx, String s, Edge edge1, Edge edge2, Edge edge3)
	{
		edge[0] = edge1;
		edge[1] = edge2;
		edge[2] = edge3;
		this.idx = idx;
		winningColor = s;
	}

	// Method to check if all the edges of the triangle have the same color
	public boolean AllEdgesSameColor()
	{

		boolean result = false;
		if (edge[0].getColor() == edge[1].getColor() && edge[0].getColor() == edge[2].getColor())
		{
			result = true;
		}

		return result;
	}

	// Method to check if the edges of the triangle have the same color as the
	// winning triangle for that idx
	public boolean AllEdgesWinningColor()
	{
		boolean result = false;
		if (edge[0].getColor() == edge[1].getColor() && edge[0].getColor() == edge[2].getColor()
				&& edge[0].getColor() == winningColor)
		{
			result = true;
		}
		return result;

	}

	// Return the idx of the triangle
	public int getTriangleIdx()
	{
		return idx;
	}

	public boolean winColor()
	{

		for (int i = 0; i < edge.length; i++)
		{
			if (edge[i].getColor() == winningColor)
			{
				if (i == 2)
				{
					return true;
				}
				continue;

			} else
			{

				return false;

			}

		}
		return false;

	}

	public boolean sameColor()
	{
		if (edge[0].getColor() == edge[1].getColor() && edge[1].getColor() == edge[2].getColor())
		{
			return true;
		}

		return false;
	}

}
