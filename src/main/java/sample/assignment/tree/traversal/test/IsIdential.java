package sample.assignment.tree.traversal.test;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class IsIdential {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		BTreePrinter.printNode(root);
		System.out.println("Inside main");
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		root1.right.left = new TreeNode(6);
		root1.right.right = new TreeNode(7);
		root1.right.right.right = new TreeNode(9);
	
	//	BTreePrinter.printNode(root);
		
	}
	
	public boolean isIdentiacal(TreeNode root1, TreeNode root2){
		if(root1==null && root2==null){
			return true;
		}
		
		if(root1!=null){
			return false;
		}
		
		if(root2!=null){
			return false;
		}
		
		if(root1.val == root2.val){
			if(isIdentiacal(root1.left, root2.right)){
				if((isIdentiacal(root1.left, root2.right))) {
					return true;
				}
			}
		}
		return false;
	}
	
	

}
