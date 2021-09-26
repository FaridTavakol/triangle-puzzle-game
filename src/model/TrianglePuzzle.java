package model;

public class TrianglePuzzle {
	/* Constructor */
	public TrianglePuzzle()
	{
		node = new Node[10];
		// node0
		int[] friendNodes0 = new int[2];
		friendNodes0[0] = 1; // idx for neighbor node for node0 in this case refers to node 1
		friendNodes0[1] = 2; // idx for neighbor node for node0 in this case refers to node 2
		node[0] = new Node(0, friendNodes0); // creating node0 with the info regarding all its neighboring nodes
		// node1
		int[] friendNodes1 = new int[4];
		friendNodes1[0] = 0; // idx for neighbor node for node1
		friendNodes1[1] = 2; // idx for neighbor node for node1
		friendNodes1[2] = 4; // idx for neighbor node for node1
		friendNodes1[3] = 3; // idx for neighbor node for node1
		node[1] = new Node(1, friendNodes1); // creating node1 with the info regarding all its neighboring nodes
		// node2
		int[] friendNodes2 = new int[4];
		friendNodes2[0] = 0; // idx for neighbor node for node2
		friendNodes2[1] = 5; // idx for neighbor node for node2
		friendNodes2[2] = 4; // idx for neighbor node for node2
		friendNodes2[3] = 1; // idx for neighbor node for node2
		node[2] = new Node(2, friendNodes2); // creating node2 with the info regarding all its neighboring nodes
		// node3
		int[] friendNodes3 = new int[4];
		friendNodes3[0] = 1; // idx for neighbor node for node3
		friendNodes3[1] = 4; // idx for neighbor node for node3
		friendNodes3[2] = 7; // idx for neighbor node for node3
		friendNodes3[3] = 6; // idx for neighbor node for node3
		node[3] = new Node(3, friendNodes3); // creating node3 with the info regarding all its neighboring nodes
		// node4
		int[] friendNodes4 = new int[6];
		friendNodes4[0] = 1;// idx for neighbor node for node4
		friendNodes4[1] = 2;// idx for neighbor node for node4
		friendNodes4[2] = 5;// idx for neighbor node for node4
		friendNodes4[3] = 8;// idx for neighbor node for node4
		friendNodes4[4] = 7;// idx for neighbor node for node4
		friendNodes4[5] = 3;// idx for neighbor node for node4
		node[4] = new Node(4, friendNodes4); // creating node4 with the info regarding all its neighboring nodes
		// node5
		int[] friendNodes5 = new int[4];
		friendNodes5[0] = 2; // idx for neighbor node for node5
		friendNodes5[1] = 9; // idx for neighbor node for node5
		friendNodes5[2] = 8; // idx for neighbor node for node5
		friendNodes5[3] = 4; // idx for neighbor node for node5
		node[5] = new Node(5, friendNodes5); // creating node5 with the info regarding all its neighboring nodes
		// node6
		int[] friendNodes6 = new int[2];
		friendNodes6[0] = 3; // idx for neighbor node for node6
		friendNodes6[1] = 7; // idx for neighbor node for node6
		node[6] = new Node(6, friendNodes6); // creating node6 with the info regarding all its neighboring nodes
		// node7
		int[] friendNodes7 = new int[4];
		friendNodes7[0] = 3; // idx for neighbor node for node7
		friendNodes7[1] = 4; // idx for neighbor node for node7
		friendNodes7[2] = 8; // idx for neighbor node for node7
		friendNodes7[3] = 6; // idx for neighbor node for node7
		node[7] = new Node(7, friendNodes7); // creating node7 with the info regarding all its neighboring nodes
		// node8
		int[] friendNodes8 = new int[4];
		friendNodes8[0] = 4; // idx for neighbor node for node8
		friendNodes8[1] = 5; // idx for neighbor node for node8
		friendNodes8[2] = 9; // idx for neighbor node for node8
		friendNodes8[3] = 7; // idx for neighbor node for node8
		node[8] = new Node(8, friendNodes8); // creating node8 with the info regarding all its neighboring nodes
		// node9
		int[] friendNodes9 = new int[2];
		friendNodes9[0] = 5; // idx for neighbor node for node9
		friendNodes9[1] = 8; // idx for neighbor node for node9
		node[9] = new Node(9, friendNodes9); // creating node9 with the info regarding all its neighboring nodes

	}

	/* Attributes */
	public Node[] node;

	/* Methods */
	//

}
