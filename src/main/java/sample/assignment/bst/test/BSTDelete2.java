package sample.assignment.bst.test;


import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class BSTDelete2 {
	
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
		BSTDelete2 bstd = new BSTDelete2();
	//	System.out.println(bstd.findMax(root).val);
		bstd.delete(root, 3);
		BTreePrinter.printNode(root);
	
	}
	
	 public TreeNode delete(TreeNode root, int data){
		if(root==null){
			return null;
		} else if(root.val>data){
			root.left = delete(root.left,data);
		} else if(root.val<data){
			root.right = delete(root.right,data);
		} else {
			if(root.left==null){
				root= root.right;
			} else if(root.right==null){
				root= root.left;
			} else{
				TreeNode temp = minValue(root.right);
				root.val = temp.val;
				root.right = delete(root.right,root.val);
			}
			 
			}
		return root;
			
		}
		
		 
	public TreeNode minValue(TreeNode root) {
		while(root.left != null){
	        root = root.left;
	    }
	    return root;
	}
		
		
	}
		
