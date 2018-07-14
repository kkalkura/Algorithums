package sample.assignment.tree.traversal;

import java.util.ArrayList;
import java.util.List;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;


public class LeavesofBinaryTree {

	public static void main(String[] argument){
		System.out.println("Inside the main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		BTreePrinter.printNode(root);
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		leavesofaTree(root,results);
		System.out.println(results);
		}
	
	public static int leavesofaTree(TreeNode root , List<List<Integer>> results){
		if(root==null){
			return -1;
		}
		
		int leftHeight = leavesofaTree(root.left , results);
		int rightHeight = leavesofaTree(root.right , results);
		int level = Math.max(leftHeight, rightHeight) +1;
		if(results.size()== level){
			results.add(new ArrayList());		
		}
		results.get(level).add(root.val);
       // root.left = root.right = null;
        return level;

	}
}
