package model;

public class Tree {

	private Node rootNode;
	private int height;

	public Tree() {
		height = 0;
		rootNode = new Node();	
	}
	
	// Getters & Setters
	public int getHeight() {     return height;     }
	public void setHeight(int h) {     height = h;    }
	
	public Node getRoot() {     return rootNode;     }
	public void setRoot(Node r) {    rootNode = r;    }
	
	
	// functions
	public void add(int element) {
		
		Node newNode = new Node(element);
		
		newNode.setParentNode(new Node());
		newNode.setLeftChild(new Node());
		newNode.setRightChild(new Node());
		
		// tree is empty
		if (rootNode.getElement() == -1) {
			newNode.setRank(1);
			setRoot(newNode);
			setHeight(1);
		}
		
		// tree is NOT empty
		else {
			Node currentNode = getRoot();
			
			boolean added = false;
			
			for (int i = 1; i <= getHeight(); i++) {
				
				if (!added) {
					// check if left child node is empty FIRST
					if (currentNode.getLeftChild().getElement() == -1) {
						newNode.setParentNode(currentNode);
						newNode.setRank(currentNode.getRank()+1);
						currentNode.setLeftChild(newNode);
						setHeight(getHeight()+1);
						added = true;
					}
					// if left child is full, check if right child node is empty SECOND
					else if (currentNode.getRightChild().getElement() == -1) {
						newNode.setParentNode(currentNode);
						newNode.setRank(currentNode.getRank()+1);
						currentNode.setRightChild(newNode);
						added = true;
					}
					// both child nodes are taken, move down in the tree
					else {
						Node leftChildNode = currentNode.getLeftChild();
						Node rightChildNode = currentNode.getRightChild();
						
						// if either of the current node's left child's children are empty, set the current node to the left child of the current node 
						if (leftChildNode.getLeftChild().getElement() == -1 || leftChildNode.getRightChild().getElement() == -1)
							currentNode = currentNode.getLeftChild();
						// if both of the current node's left child's children are filled, check the current node's right child node's children if they are both filled
						else if (rightChildNode.getLeftChild().getElement() == -1 || rightChildNode.getRightChild().getElement() == -1)
							currentNode = currentNode.getRightChild();
						// else if all child nodes of the current node's children are taken, start with the left child's left child
						else 
							currentNode = currentNode.getLeftChild();
					}
				}
				else {
					break; // break the loop if the node has been added
				}
			}
		}
	}
	
}
