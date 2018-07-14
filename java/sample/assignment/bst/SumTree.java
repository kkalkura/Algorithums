package sample.assignment.bst;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

 class Sum {
	int sum=0;
}
public class SumTree {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(30);
		root.right = new TreeNode(70);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(40);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(80);
		BTreePrinter.printNode(root);
		SumTree bstd = new SumTree();
		Sum S = new Sum();
		bstd.modifyBST(root, new Sum());
		BTreePrinter.printNode(root);
	}
	
	
	
	public void modifyBST(TreeNode root, Sum Sum){
		if(root==null){
			return ;
		}
		
		modifyBST(root.right,Sum);
		
		Sum.sum = Sum.sum+root.val;
		root.val = Sum.sum;
		modifyBST(root.left,Sum);

		
	}


}
