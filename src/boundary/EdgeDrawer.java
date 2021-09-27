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

	}

	/* Attributes */
	public Model model;
	public TrianglePuzzleApp trianglePuzzleApp;

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
		// Setting the thickness of the edges
		g2d.setStroke(new BasicStroke(5));

		Rectangle tglBtn1Bounds = trianglePuzzleApp.tglbtn1.getBounds();
		Point tglBtn1Center = center(tglBtn1Bounds);

		Rectangle tglBtn2Bounds = trianglePuzzleApp.tglbtn2.getBounds();
		Point tglBtn2Center = center(tglBtn2Bounds);

		Rectangle tglBtn3Bounds = trianglePuzzleApp.tglbtn3.getBounds();
		Point tglBtn3Center = center(tglBtn3Bounds);

		Rectangle tglBtn4Bounds = trianglePuzzleApp.tglbtn4.getBounds();
		Point tglBtn4Center = center(tglBtn4Bounds);

		Rectangle tglBtn5Bounds = trianglePuzzleApp.tglbtn5.getBounds();
		Point tglBtn5Center = center(tglBtn5Bounds);

		Rectangle tglBtn6Bounds = trianglePuzzleApp.tglbtn6.getBounds();
		Point tglBtn6Center = center(tglBtn6Bounds);

		Rectangle tglBtn7Bounds = trianglePuzzleApp.tglbtn7.getBounds();
		Point tglBtn7Center = center(tglBtn7Bounds);

		Rectangle tglBtn8Bounds = trianglePuzzleApp.tglbtn8.getBounds();
		Point tglBtn8Center = center(tglBtn8Bounds);

		Rectangle tglBtn9Bounds = trianglePuzzleApp.tglbtn9.getBounds();
		Point tglBtn9Center = center(tglBtn9Bounds);

		Rectangle tglBtn10Bounds = trianglePuzzleApp.tglbtn10.getBounds();
		Point tglBtn10Center = center(tglBtn10Bounds);

//		g2d.drawLine(20, 20, 2500, 2500);

	}

	// Method to find the center of each node Point(x,y)
	protected Point center(Rectangle bounds)
	{
		Point point = new Point();
		point.x = bounds.x + (bounds.width / 2);
		point.y = bounds.y + (bounds.height / 2);
		return point;
	}

	// Method to retrieve the color of each edge
	public void setColor(Edge edge, int i, Graphics g2d)
	{
		if (model.getPuzzle().edge[i].color.equals("red"))
		{
			g2d.setColor(Color.red);
		} else if (model.getPuzzle().edge[i].color.equals("blue"))
		{
			g2d.setColor(Color.blue);
		} else
		{
			g2d.setColor(Color.green);
		}
	}

	public void drawAllEdges(Graphics g2d, Model m)
	{

		setColor(model.getPuzzle().edge[2], 0, g2d);
		g2d.drawLine(tglBtn1Center.x - 30, tglBtn1Center.y, tglBtn2Center.x - 30, tglBtn2Center.y);
	}

}
