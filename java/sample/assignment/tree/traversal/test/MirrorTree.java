package sample.assignment.tree.traversal.test;

import sample.assignment.tree.TreeNode;

public class MirrorTree {
	
	
	




public static TreeNode mirror(TreeNode root){
	if(root==null){
		return null;
	}

   TreeNode temp =null;
	
	if(root.left!=null && root.right!=null){
		temp = root.left;
		root.left=root.right;
		root.right=temp;		
	} else if(root.left==null && root.right!=null) {
		root.left = root.right;
		root.right = null;
	} else if(root.right==null && root.left!=null) {
		root.right= root.left;
		root.left=null;
	 }
	mirror(root.left);
	mirror(root.right);

	
	return root;
	
	
}
}
