package sample.assignment.tree;

import java.util.Iterator;
import java.util.LinkedList;

public class CountNodes {

	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		CountNodes cnt = new CountNodes();
		System.out.println(cnt.countNodes(root));
	
	}
	
	
	public int countNodes(TreeNode root) {

	    int leftDepth = leftDepth(root);
		int rightDepth = rightDepth(root);

		if (leftDepth == rightDepth)
			return (1 << leftDepth) - 1;
		else
			return 1+countNodes(root.left) + countNodes(root.right);

	}
	
	
	
	private int rightDepth(TreeNode root) {
		// TODO Auto-generated method stub
		int dep = 0;
		while (root != null) {
			root = root.right;
			dep++;
		}
		return dep;
	}

	private int leftDepth(TreeNode root) {
		// TODO Auto-generated method stub
		int dep = 0;
		while (root != null) {
			root = root.left;
			dep++;
		}
		return dep;
	}

}
