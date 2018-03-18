package controller;

import model.Tree;

public class Main {

	//private Tree mergeTree;
	
	public static void main(String[] args) {
		
		//System.out.println("testing start of program...");
		
		// start of program
		Tree mergeTree = new Tree();
		
		// TODO: Move to test file later on
		mergeTree.add(0);
		mergeTree.add(1);
		mergeTree.add(2);
		mergeTree.add(3);
		mergeTree.add(4);
		mergeTree.add(5);
		mergeTree.add(6);
		
		mergeTree.split();
		
		
	}
	
	
	
	
	
	
}
