package sample.assignment.tree.traversal.test;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class checkSibilingsorNot2 {
	
	
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
		System.out.println(checkSibiling(root,2,3));
	}




public static boolean checkSibiling(TreeNode root, int a ,int b){

	if(root==null){
		return false;
	}
	if(root.left!=null && root.right!=null ) {
		if((root.left.val==a  && root.right.val==b) || root.left.val==b && root.right.val==a ){
			return true;
		} else {
			if(checkSibiling(root.left,a,b) || checkSibiling(root.left,a,b))
			{
				return true;
			}
		}
	}
	
	return false;
		
}
}