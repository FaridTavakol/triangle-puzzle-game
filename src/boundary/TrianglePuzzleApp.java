package boundary;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import controllers.NodeHandler;
import controllers.ResetController;
import controllers.SwapEdgeController;
import controllers.UnselectNodesController;
import model.Model;
import model.TrianglePuzzle;

public class TrianglePuzzleApp extends JFrame {

	/* Attributes */
	public JPanel contentPane;
	// public TrianglePuzzle trianglePuzzle;
	public Model model;
	public NodeHandler nodeHandler;
	public JToggleButton tglbtn1, tglbtn2, tglbtn3, tglbtn4, tglbtn5, tglbtn6, tglbtn7, tglbtn8, tglbtn9, tglbtn10;
	public JToggleButton[] tglButtonArray;
	private EdgeDrawer panel;
	private ResetController resetController;
	JLabel lblNumberOfMoves, labelNumberOfMovesScore, lblPlayerScore;

	// Number of active nodes
	private int activeNodes = 0;
	private JLabel lblCongradulatoryMessage;

	/**
	 * Create the frame.
	 * 
	 * @param m
	 */
	public TrianglePuzzleApp(Model m, TrianglePuzzle tp)

	{
		this.model = m;

		nodeHandler = new NodeHandler(m);
		UnselectNodesController unselectNodesCtrl = new UnselectNodesController(m, TrianglePuzzleApp.this);
		SwapEdgeController swapEdgeCtrl = new SwapEdgeController(model, TrianglePuzzleApp.this, nodeHandler);
		resetController = new ResetController(m, TrianglePuzzleApp.this);

		setTitle("Triangle Puzzle Application (c) 2021");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 388);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnResetGame = new JButton("Reset Game");
		btnResetGame.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				resetController.process();
				// It should return value of 0
				activeNodes = nodeHandler.getNumberOfActiveNodes();

				// You also have to reset score as well

			}
		});
		btnResetGame.setBounds(456, 49, 119, 25);
		btnResetGame.setForeground(SystemColor.text);
		btnResetGame.setBackground(Color.DARK_GRAY);

		JButton btnUnselectAll = new JButton("Unselect All");
		btnUnselectAll.setBounds(456, 92, 117, 25);
		btnUnselectAll.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				unselectNodesCtrl.unselectAllNodes();
				// It should return value of 0
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});
		btnUnselectAll.setBackground(Color.DARK_GRAY);
		btnUnselectAll.setForeground(Color.WHITE);

		lblPlayerScore = new JLabel("0");
		lblPlayerScore.setBounds(175, 273, 40, 15);

		JButton btnSwapEdges = new JButton("Swap Edges");
		btnSwapEdges.setBounds(456, 135, 120, 25);
		btnSwapEdges.setForeground(Color.WHITE);
		btnSwapEdges.setBackground(Color.DARK_GRAY);
		btnSwapEdges.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				swapEdgeCtrl.SwapEdge();
				// Redraw the puzzle with the updated edges
//				contentPane.repaint();

			}
		});

		JLabel lblScoreText = new JLabel("Score:");
		lblScoreText.setBounds(112, 273, 45, 15);

		tglbtn1 = new JToggleButton("");
		tglbtn1.setBounds(193, 17, 22, 21);
		tglbtn1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{

				nodeHandler.setNodeState("tglbtn1");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}

		});

		tglbtn2 = new JToggleButton("");
		tglbtn2.setBounds(153, 69, 22, 21);
		tglbtn2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn2");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
//				tglbtn1.repaint();
//				tglbtn2.repaint();
//				tglbtn3.repaint();
//				tglbtn4.repaint();
//				tglbtn5.repaint();
//				tglbtn6.repaint();
//				tglbtn7.repaint();
//				tglbtn8.repaint();
//				tglbtn9.repaint();
//				tglbtn10.repaint();

			}
		});

		tglbtn4 = new JToggleButton("");
		tglbtn4.setBounds(112, 117, 22, 21);
		tglbtn4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn4");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		tglbtn7 = new JToggleButton("");
		tglbtn7.setBounds(77, 168, 22, 21);
		tglbtn7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn7");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		tglbtn8 = new JToggleButton("");
		tglbtn8.setBounds(165, 168, 22, 21);
		tglbtn8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn8");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		tglbtn9 = new JToggleButton("");
		tglbtn9.setBounds(240, 168, 22, 21);
		tglbtn9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn9");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		tglbtn10 = new JToggleButton("");
		tglbtn10.setBounds(309, 168, 22, 21);
		tglbtn10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn10");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		tglbtn5 = new JToggleButton("");
		tglbtn5.setBounds(193, 117, 22, 21);
		tglbtn5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn5");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		tglbtn6 = new JToggleButton("");
		tglbtn6.setBounds(268, 117, 22, 21);
		tglbtn6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn6");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		tglbtn3 = new JToggleButton("");
		tglbtn3.setBounds(232, 69, 22, 21);
		tglbtn3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn3");
				// It can return values between 1 to 10
				activeNodes = nodeHandler.getNumberOfActiveNodes();
			}
		});

		panel = new EdgeDrawer(m, TrianglePuzzleApp.this);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(35, 0, 363, 245);
		contentPane.setLayout(null);
		contentPane.add(tglbtn4);
		contentPane.add(lblScoreText);
		contentPane.add(lblPlayerScore);
		contentPane.add(tglbtn7);
		contentPane.add(tglbtn8);
		contentPane.add(tglbtn2);
		contentPane.add(tglbtn9);
		contentPane.add(tglbtn3);
		contentPane.add(tglbtn5);
		contentPane.add(tglbtn1);
		contentPane.add(tglbtn6);
		contentPane.add(btnSwapEdges);
		contentPane.add(btnUnselectAll);
		contentPane.add(btnResetGame);
		contentPane.add(tglbtn10);
		contentPane.add(panel);
		// Creating the array containing all the nodes
		tglButtonArray = new JToggleButton[10];
		tglButtonArray[0] = tglbtn1;
		tglButtonArray[1] = tglbtn2;
		tglButtonArray[2] = tglbtn3;
		tglButtonArray[3] = tglbtn4;
		tglButtonArray[4] = tglbtn5;
		tglButtonArray[5] = tglbtn6;
		tglButtonArray[6] = tglbtn7;
		tglButtonArray[7] = tglbtn8;
		tglButtonArray[8] = tglbtn9;
		tglButtonArray[9] = tglbtn10;

		lblNumberOfMoves = new JLabel("Number of Moves:");
		lblNumberOfMoves.setBounds(232, 273, 127, 15);
		contentPane.add(lblNumberOfMoves);

		labelNumberOfMovesScore = new JLabel("0");
		labelNumberOfMovesScore.setBounds(380, 273, 70, 15);
		contentPane.add(labelNumberOfMovesScore);

		lblCongradulatoryMessage = new JLabel("You have not yet won the game!");
		lblCongradulatoryMessage.setBounds(112, 313, 307, 15);
		contentPane.add(lblCongradulatoryMessage);
	}

	public int getActiveNodes()
	{
		return activeNodes;
	}

	public JLabel getNumberOfMoves()
	{
		return labelNumberOfMovesScore;
	}

	public JLabel getScore()
	{
		return lblPlayerScore;
	}

	public JLabel getCongratulatoryMessage()
	{
		return lblCongradulatoryMessage;
	}
}
