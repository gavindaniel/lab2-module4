package model;

public class Node {

	private int element;			// content of the Node (e.g., element = 17)
	private Node parentNode;		// parent Node
	private Node leftChild;		// Left Child Node
	private Node rightChild;		// Right Child Node
	private int rank;
	
	// contructors
	public Node() {
		element = -1;	// -1 is always the starting value of any node
	}
	public Node(int e) {
		element = e;
	}
	
	// Getters & Setters
	
	public int getElement() {	return element;    }
	public void setElement(int e) {    element = e;    }
	
	public Node getParentNode() {    return parentNode;    }
	public void setParentNode(Node p) {    parentNode = p;    }
	
	public Node getLeftChild() {    return leftChild;    }
	public void setLeftChild(Node lc) {    leftChild = lc;    }
	
	public Node getRightChild() {    return rightChild;    }
	public void setRightChild(Node rc) {    rightChild = rc;    }
		
	public int getRank() {    return rank;    }
	public void setRank(int r) {    rank = r;    }
	
}
