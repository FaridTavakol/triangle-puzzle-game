package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import boundary.TrianglePuzzleApp;
import controllers.ExitApplicationController;
import model.Model;
import model.TrianglePuzzle;

public class Main {

	public static void main(String[] args)
	{

		Model m = new Model();
		TrianglePuzzle tp = new TrianglePuzzle();
		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m, tp);
		tpa.addWindowListener(new WindowAdapter()
		{

			public void windowClosing(WindowEvent e)
			{
				new ExitApplicationController(tpa).process();
			}

		});
		tpa.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		tpa.setVisible(true);

//	
	}
}
