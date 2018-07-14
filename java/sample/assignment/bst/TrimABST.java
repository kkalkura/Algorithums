package sample.assignment.bst;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class TrimABST {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(11);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(13);
		BTreePrinter.printNode(root);
		TrimABST bstd = new TrimABST();
		BTreePrinter.printNode(bstd.TrimBST(root, 10, 13));
	}
	
	public TreeNode TrimBST(TreeNode root,int L ,int R){
		if(root==null){
			return null;
		}
		
		if(root.val<L) {
			return TrimBST(root.right,L,R);
		}
		if(root.val>R){
			return TrimBST(root.left,L,R);
		}
		root.left =  TrimBST(root.left,L,R);
		root.right =  TrimBST(root.right,L,R);
		
		return root;
	}

}
