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
	
	// add a node to the tree
	public void add(int element) {
		
		Node newNode = new Node(element);
		
		newNode.setParentNode(new Node());
		newNode.setLeftChild(new Node());
		newNode.setRightChild(new Node());
		
		// tree is empty
		if (this.getRoot().getElement() == -1) {
			newNode.setRank(1);
			this.setRoot(newNode);
			this.setHeight(1);
		}
		
		// tree is NOT empty
		else {
			Node currentNode = this.getRoot();
			
			boolean added = false;
			
			for (int i = 1; i <= this.getHeight(); i++) {
				
				if (!added) {
					// check if left child node is empty FIRST
					if (currentNode.getLeftChild().getElement() == -1) {
						newNode.setParentNode(currentNode);
						newNode.setRank(currentNode.getRank()+1);
						currentNode.setLeftChild(newNode);
						this.setHeight(getHeight()+1);
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
	
	// 
	public void split() {
		
		Tree s1 = new Tree();
		Tree s2 = new Tree();
		Node currentNode = this.getRoot(); // always start at the root
		
		// we know there are AT LEAST 2 elements, so we can always assume there is a ROOT & LEFT CHILD to that root
		s1.add(currentNode.getElement());
		s2.add(currentNode.getLeftChild().getElement());
		
		if (currentNode.getRightChild().getElement() != -1) 
			s1.add(currentNode.getRightChild().getElement());
		
		currentNode = currentNode.getLeftChild();
		
		for (int i = 2; i < this.getHeight(); i++) {
			
			
			
			if (currentNode.getLeftChild().getElement() != -1) 
				s1.add(currentNode.getLeftChild().getElement());
			if (currentNode.getRightChild().getElement() != -1)
				s2.add(currentNode.getRightChild().getElement());
			
			currentNode = currentNode.getParentNode().getRightChild();
			
			if (currentNode.getLeftChild().getElement() != -1) 
				s1.add(currentNode.getLeftChild().getElement());
			if (currentNode.getRightChild().getElement() != -1)
				s2.add(currentNode.getRightChild().getElement());
			
			// if we're not at the end of the tree
			if ( (i+1) != this.getHeight() )
				currentNode = currentNode.getLeftChild();
			
		}
	}
}
