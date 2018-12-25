package com.amz.tree.traversal;

/**
 * @author Abhishek Bisht
 *
 */
class Node{
	
	Node left ;
	Node right ;	
	int data ;
	
	Node(int data) {
		this.data = data;
		left = right = null;
	}
	
}
