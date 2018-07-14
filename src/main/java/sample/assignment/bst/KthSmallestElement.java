package sample.assignment.bst;

import java.util.Stack;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class KthSmallestElement {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(10);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(11);
		BTreePrinter.printNode(root);
		KthSmallestElement bstd = new KthSmallestElement();
		System.out.println(bstd.inorderTraversal(root, 7));
	

	}
	
	public int inorderTraversal(TreeNode root,int k){
		Stack<TreeNode> result = new Stack<TreeNode>();
		while(root!=null || !result.isEmpty()){
			while(root!=null){
				result.push(root);
				root = root.left;
			}
			
			root = result.pop();
			if(--k==0) break;
			root = root.right;
		}
		return root.val;
	}

}
