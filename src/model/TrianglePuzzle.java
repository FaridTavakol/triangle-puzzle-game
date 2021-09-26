package model;

public class TrianglePuzzle {
	/* Constructor */
	public TrianglePuzzle()
	{
		node = new Node[1];
		int[] friendNodes1 = new int[6];
		friendNodes1[0] = 1;
		friendNodes1[1] = 2;
		friendNodes1[2] = 5;
		friendNodes1[3] = 8;
		friendNodes1[4] = 7;
		friendNodes1[5] = 3;
		double[] center_crdnts = new double[2];
		center_crdnts[0] = 20.0;
		center_crdnts[1] = 10.0;
		node[0] = new Node(4, friendNodes1, center_crdnts);

	}

	/* Attributes */
	public Node[] node;

	/* Methods */
	//

}
