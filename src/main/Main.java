package main;

import boundary.TrianglePuzzleApp;
import model.Model;
import model.TrianglePuzzle;

public class Main {

	public static void main(String[] args)
	{

		Model m = new Model();
		TrianglePuzzle tp = new TrianglePuzzle();

		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m, tp);
		tpa.setVisible(true);
//		System.out.println(tp.node[4].getFriendNodeIdx(3));

//		int[] friendNodes1 = new int[6];
//		friendNodes1[0] = 1;
//		friendNodes1[1] = 2;
//		friendNodes1[2] = 5;
//		friendNodes1[3] = 8;
//		friendNodes1[4] = 7;
//		friendNodes1[5] = 3;
//		Node node4 = new Node(4, friendNodes1);
//		
//		for (int i = 0; i < friendNodes1.length; i++)
//		{
//			System.out.println(node4.getFriendNodeIdx(i));
//
//		}
//		System.out.println(node4.getNodeState());
//		node4.setNodeState(true);
//		System.out.println(node4.getNodeState());
//		System.out.println(tp.node[0].getNodeState());

	}
}
