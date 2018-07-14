package sample.assignment.bst;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class CheckBSTOrNot {
	
	private static TreeNode prev=null;
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
	//	root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(7);
		BTreePrinter.printNode(root);
		CheckBSTOrNot bstd = new CheckBSTOrNot();
		System.out.println(bstd.binaryTreeOrNot(root,null,null));
	//	System.out.println(bstd.binaryTreeOrNotInorder(root));

	}
	
	public boolean binaryTreeOrNot(TreeNode root,Integer min,Integer max)
	{
		
		if(root==null){
			return true;
		}
		 if(min!=null && root.val <= min) {
			 return false;
		 }
		 if(max!=null && root.val >= max) {
			 return false;
		 }

		 
		 boolean result =  (binaryTreeOrNot(root.left,min,root.val)) && (binaryTreeOrNot(root.right,root.val,max));
		 return result;
		
	}
	
	
	public boolean binaryTreeOrNotInorder(TreeNode root)
	{
		
		if(root==null){
			return true;
		}
		if(!binaryTreeOrNotInorder(root.left)){
			return false;
		}
		if(prev!=null && root.val<= prev.val){
			return false;
		}
		prev =root;
		
		if(!binaryTreeOrNotInorder(root.right)){
			return false;
		}
		
		return true;
		
		
		
	}


}
