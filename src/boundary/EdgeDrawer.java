package boundary;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JPanel;

import model.Edge;
import model.Model;

public class EdgeDrawer extends JPanel {

	/**
	 * Create the panel.
	 */
	public EdgeDrawer(Model m, TrianglePuzzleApp tpa)
	{
		this.model = m;
		this.trianglePuzzleApp = tpa;
		this.tglBtnBounds = new Rectangle[10];
		this.tglBtnCenter = new Point[10];

	}

	/* Attributes */
	public Model model;
	public TrianglePuzzleApp trianglePuzzleApp;
	public Rectangle tglBtnBounds[];
	public Point tglBtnCenter[];

	/* Methods */
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		if (model == null)
		{
			return;
		}

		Graphics2D g2d = (Graphics2D) g.create();

		// Draw the Edge from the center of one node to another
//		g2d.setColor(Color.red);

		setTglButtonBounds();
		setTglButtonCenter();
		// Setting the thickness of the edges
		g2d.setStroke(new BasicStroke(5));
		drawAllEdges(g2d);
//		g2d.drawLine(20, 20, 2500, 2500);

	}

	// Method to find the center of each node and return as Point(x,y), Offset value
	// is for matching the drawn line with the nodes
	protected Point calculateCenter(Rectangle bounds, int xOffset, int yOffset)
	{
		Point point = new Point();
		point.x = (bounds.x + (bounds.width / 2)) - xOffset;
		point.y = (bounds.y + (bounds.height / 2)) - yOffset;
		return point;
	}

	// Method to retrieve the color of each edge
	public void setColor(Edge edge, Graphics g2d)
	{
		if (model.getPuzzle().edge[edge.getEdgeIdx()].color.equals("red"))
		{
			g2d.setColor(Color.red);
		} else if (model.getPuzzle().edge[edge.getEdgeIdx()].color.equals("blue"))
		{
			g2d.setColor(Color.blue);
		} else
		{
			g2d.setColor(Color.green);
		}

	}

	// Stores the bound for each node
	public void setTglButtonBounds()
	{
		for (int i = 0; i < tglBtnBounds.length; i++)
		{
			tglBtnBounds[i] = trianglePuzzleApp.tglButtonArray[i].getBounds();
		}

	}

	// Method to populate the toggle center array with the center values of each
	// node
	public void setTglButtonCenter()
	{
		for (int i = 0; i < tglBtnCenter.length; i++)
		{
			tglBtnCenter[i] = calculateCenter(tglBtnBounds[i], 30, 0);
		}

	}

	// Method to draw all edges
	public void drawAllEdges(Graphics g2d)
	{

		for (int i = 0; i < model.getPuzzle().edge.length; i++)
		{
			setColor(model.getPuzzle().edge[i], g2d);
			drawEdge(model.getPuzzle().edge[i], g2d);

		}

	}

	// Method to draw an edge
	public void drawEdge(Edge edge, Graphics g2d)
	{
		int[] nodeIdx = edge.getNodeIdx();
		g2d.drawLine(tglBtnCenter[nodeIdx[0]].x, tglBtnCenter[nodeIdx[0]].y, tglBtnCenter[nodeIdx[1]].x,
				tglBtnCenter[nodeIdx[1]].y);

	}

}
