package sample.assignment.bst;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class PruneBST {
	
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
		PruneBST bstd = new PruneBST();
		BTreePrinter.printNode(bstd.PruneBST(root, 12, 13));
		
	}
	
	public TreeNode PruneBST(TreeNode root, int L,int R){
		if(root==null){
			return null;
		}
		root.left = PruneBST(root.left, L,R);
		root.right = PruneBST(root.right, L,R);
		if(L<=root.val && root.val>=R){
			return root;
		}
		if(root.val <L){
			return root.right;
		}
		if(root.val>R){
			return root.right;
		}
		return root;
	}
	

}
