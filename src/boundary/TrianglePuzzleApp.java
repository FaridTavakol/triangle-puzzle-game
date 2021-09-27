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
import controllers.UnselectNodesController;
import model.Model;
import model.TrianglePuzzle;

public class TrianglePuzzleApp extends JFrame {

	/* Attributes */
	public JPanel contentPane;
//	public TrianglePuzzle trianglePuzzle;
	public Model model;
	public NodeHandler nodeHandler;
	public JToggleButton tglbtn1, tglbtn2, tglbtn3, tglbtn4, tglbtn5, tglbtn6, tglbtn7, tglbtn8, tglbtn9, tglbtn10;
	private EdgeDrawer panel;

	/**
	 * Create the frame.
	 * 
	 * @param m
	 */
	public TrianglePuzzleApp(Model m, TrianglePuzzle tp)

	{
		this.model = m;

//		this.trianglePuzzle = tp;

		nodeHandler = new NodeHandler(m);
		UnselectNodesController unselectNodesCtrl = new UnselectNodesController(m, TrianglePuzzleApp.this);

		setTitle("Triangle Puzzle Application (c) 2021");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 388);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnResetGame = new JButton("Reset Game");
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
			}
		});
		btnUnselectAll.setBackground(Color.DARK_GRAY);
		btnUnselectAll.setForeground(Color.WHITE);

		JLabel lblPlayerScore = new JLabel("0");
		lblPlayerScore.setBounds(175, 340, 8, 15);

		JButton btnSwapEdges = new JButton("Swap Edges");
		btnSwapEdges.setBounds(456, 135, 120, 25);
		btnSwapEdges.setForeground(Color.WHITE);
		btnSwapEdges.setBackground(Color.DARK_GRAY);
		btnSwapEdges.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});

		JLabel lblScoreText = new JLabel("Score:");
		lblScoreText.setBounds(112, 340, 45, 15);

		JLabel lblCongratulatoryMessage = new JLabel("");
		lblCongratulatoryMessage.setBounds(5, 340, 172, 0);

		tglbtn1 = new JToggleButton("");
		tglbtn1.setBounds(193, 17, 22, 21);
		tglbtn1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nodeHandler.setNodeState("tglbtn1");
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
		contentPane.add(lblCongratulatoryMessage);
		contentPane.add(tglbtn6);
		contentPane.add(btnSwapEdges);
		contentPane.add(btnUnselectAll);
		contentPane.add(btnResetGame);
		contentPane.add(tglbtn10);
		contentPane.add(panel);
	}
}
