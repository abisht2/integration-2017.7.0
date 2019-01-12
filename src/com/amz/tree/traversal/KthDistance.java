package com.amz.tree.traversal;

public class KthDistance {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KthDistance tree = new KthDistance();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.left.right.right = new Node(9);
		tree.root.left.right.right.right = new Node(10);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		tree.root.right.right.right = new Node(8);
		
		printKDistant(tree.root,2);

	}
	
	static void printKDistant(Node node, int k)  
    { 
        if (node == null) 
            return; 
        if (k == 0)  
        { 
            System.out.print(node.data + " "); 
            return; 
        }  
        else 
        { 
            printKDistant(node.left,k - 1); 
            printKDistant(node.right,k - 1); 
        } 
    } 

}
