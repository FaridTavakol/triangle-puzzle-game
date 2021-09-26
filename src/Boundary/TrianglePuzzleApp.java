package Boundary;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class TrianglePuzzleApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					TrianglePuzzleApp frame = new TrianglePuzzleApp();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrianglePuzzleApp()
	{
		setTitle("Triangle Puzzle Application (c) 2021");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 388);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnResetGame = new JButton("Reset Game");
		btnResetGame.setForeground(SystemColor.text);
		btnResetGame.setBackground(Color.DARK_GRAY);

		JButton btnUnselectAll = new JButton("Unselect All");
		btnUnselectAll.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		btnUnselectAll.setBackground(Color.DARK_GRAY);
		btnUnselectAll.setForeground(Color.WHITE);

		JLabel lblPlayerScore = new JLabel("0");

		JButton btnSwapEdges = new JButton("Swap Edges");
		btnSwapEdges.setForeground(Color.WHITE);
		btnSwapEdges.setBackground(Color.DARK_GRAY);
		btnSwapEdges.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});

		JLabel lblScoreText = new JLabel("Score:");

		JLabel lblCongratulatoryMessage = new JLabel("");

		JToggleButton tglbtnNewToggleButton = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1_1 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1_1_1 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1_1_1_1 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1_1_1_1_1 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1_1_1_2 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1_1_1_2_1 = new JToggleButton("");

		JToggleButton tglbtnNewToggleButton_1_1_1_1_2_1_1 = new JToggleButton("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
						.createSequentialGroup().addGap(36)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
								.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(36)
										.addComponent(tglbtnNewToggleButton_1_1_1, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(tglbtnNewToggleButton_1_1_1_1, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(71).addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addComponent(tglbtnNewToggleButton_1_1, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblScoreText)
												.addGap(18).addComponent(lblPlayerScore)))
										.addGap(4)))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addGap(12)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(47).addComponent(
										tglbtnNewToggleButton_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(39).addComponent(
										tglbtnNewToggleButton_1_1_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
								.addComponent(tglbtnNewToggleButton_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)).addComponent(lblCongratulatoryMessage,
								Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(6)
								.addComponent(tglbtnNewToggleButton_1_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addGap(166).addGroup(
										gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnSwapEdges)
												.addComponent(btnUnselectAll).addComponent(btnResetGame)))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(47).addComponent(
								tglbtnNewToggleButton_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 22,
								GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(78, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(44).addComponent(btnResetGame)
								.addGap(18).addComponent(btnUnselectAll).addGap(18).addComponent(btnSwapEdges))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 21,
										GroupLayout.PREFERRED_SIZE)
								.addGap(31)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(tglbtnNewToggleButton_1_1_1_1_2_1_1, GroupLayout.PREFERRED_SIZE,
												21, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(tglbtnNewToggleButton_1, GroupLayout.PREFERRED_SIZE, 21,
														GroupLayout.PREFERRED_SIZE)
												.addGap(27)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(tglbtnNewToggleButton_1_1_1_1_2_1,
																GroupLayout.PREFERRED_SIZE, 21,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(tglbtnNewToggleButton_1_1,
																GroupLayout.PREFERRED_SIZE, 21,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(tglbtnNewToggleButton_1_1_1_1_2,
																GroupLayout.PREFERRED_SIZE, 21,
																GroupLayout.PREFERRED_SIZE))))))
				.addGap(8)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tglbtnNewToggleButton_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 21,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(tglbtnNewToggleButton_1_1_1_1, GroupLayout.PREFERRED_SIZE, 21,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(tglbtnNewToggleButton_1_1_1, GroupLayout.PREFERRED_SIZE, 21,
												GroupLayout.PREFERRED_SIZE))
								.addGap(121)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPlayerScore).addComponent(lblScoreText)
										.addComponent(lblCongratulatoryMessage)))
						.addComponent(tglbtnNewToggleButton_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 21,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(28, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
