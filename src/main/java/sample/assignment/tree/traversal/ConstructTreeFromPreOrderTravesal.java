package sample.assignment.tree.traversal;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class ConstructTreeFromPreOrderTravesal {

	public static void main(String[] argument){
		System.out.println("Inside the main");
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
//		DiognalViewOfTree rtree = new DiognalViewOfTree();
//		rtree.diagonalPrint(root);

	}

}
