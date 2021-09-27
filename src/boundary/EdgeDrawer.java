package boundary;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JPanel;

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

		// Draw the lines from the center of one node to another
		g2d.setColor(Color.red);
		Rectangle tglBtn1Bounds = trianglePuzzleApp.tglbtn1.getBounds();
		Point tglBtn1Center = center(tglBtn1Bounds);
		Rectangle tglBtn2Bounds = trianglePuzzleApp.tglbtn2.getBounds();
		Point tglBtn2Center = center(tglBtn2Bounds);

//		g.drawLine(tglBtn1Center.x, tglBtn1Center.y, tglBtn2Center.x + 500, tglBtn2Center.y);
		System.out.println(tglBtn1Center.x);
		System.out.println(tglBtn1Center.y);

		System.out.println(tglBtn2Center.x);
		System.out.println(tglBtn2Center.y);

		g2d.drawLine(20, 20, 2500, 2500);

	}

	// Method to find the center of each node Point(x,y)
	protected Point center(Rectangle bounds)
	{
		Point point = new Point();
		point.x = bounds.x + (bounds.width / 2);
		point.y = bounds.y + (bounds.height / 2);
		return point;
	}

}
