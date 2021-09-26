package main;

import boundary.TrianglePuzzleApp;
import model.Model;
import model.Node;

public class Main {

	public static void main(String[] args)
	{

		Model m = new Model();

		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m);
		tpa.setVisible(true);
		int[] friendNodes = new int[2];
		friendNodes[0] = 1;
		friendNodes[1] = 2;
		Node node = new Node(0, friendNodes);

		System.out.println(node.getFriendNodeIdx(1));

		int[] friendNodes1 = new int[6];
		friendNodes1[0] = 1;
		friendNodes1[1] = 2;
		friendNodes1[2] = 5;
		friendNodes1[3] = 8;
		friendNodes1[4] = 7;
		friendNodes1[5] = 3;
		Node node4 = new Node(4, friendNodes1);
		for (int i = 0; i < friendNodes1.length; i++)
		{
			System.out.println(node4.getFriendNodeIdx(i));

		}
		System.out.println(node4.getNodeState());
		node4.setNodeState(true);
		System.out.println(node4.getNodeState());

	}
}
